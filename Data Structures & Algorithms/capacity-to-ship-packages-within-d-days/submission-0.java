class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0 ;
        int right =0 ;
        for(int i = 0 ; i < weights.length ; i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        int res = right ;
        // int cap = (left+right)/2;
    while(left<=right){
        //  int currCap = cap ;
        int cap = (left+right)/2;
         if(isCap(weights,cap,days)){
            res=Math.min(res,cap);
            right=cap-1;
         }
         else{
            left=cap+1;
         }
    }
   return res;
        
    }
    public boolean isCap(int[]weights,int cap,int days){
        int cc = cap ; int ships=1;
        for(int w : weights){
            if(cc-w<0){
                ships++;
                if(ships>days) return false;
                cc=cap;
            }
             cc-= w;
        }

         return true;
    }
}