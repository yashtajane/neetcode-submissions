class Solution {
    public double myPow(double x, int n) {
        double result = 1.0 ;
        if(n<0){
            int u = -n;
             for(int i=1 ; i<=u ; i++){
            result=result*(1/x);
        }
        return result;
        }
        else{
        for(int i=1 ; i<=n ; i++){
            result=result*x;
        }
        }
        return result;

    }
}
