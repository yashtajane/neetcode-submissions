class Solution {
    public int maxProfit(int[] prices) {
         int maxpr=0,currmaxpr=0;
        for(int i = 0 ; i<prices.length ; i++){
            for(int j = i+1 ; j<prices.length; j++){
                int temp= prices[j]-prices[i];
                currmaxpr=Math.max(temp,currmaxpr);
            }
            maxpr = Math.max(maxpr,currmaxpr);
        }
           return maxpr;

    }

      
         
          
}
