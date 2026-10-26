class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer>org = new HashSet<>();
        while(!org.contains(n)){
            org.add(n);
            n = sumOfSquares(n);
            if(n==1) return true ;
        }
        return false ;
    }
    int sumOfSquares(int n){
        int output = 0;
        while(n>0){
        int digit = n%10;
        digit=digit*digit;
        output+=digit;
        n/=10;
        }

        return output ;
    }
}
