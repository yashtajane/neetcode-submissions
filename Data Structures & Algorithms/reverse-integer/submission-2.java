class Solution {
    public int reverse(int x) {
     long res = cal(Math.abs(x),0)*(x<0 ?-1:1);
     if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE){
        return 0 ;
     }
       return (int) res ;
    }
    long cal(int n,long r){
        if(n==0){
            return r;
        }

        r = (n%10) + r* 10 ;
        return cal(n/10,r);
    }
}
