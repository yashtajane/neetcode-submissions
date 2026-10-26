class Solution {
    public int maxProfit(int[] prices) {
        return dfs(prices,0,true);
        }

    public int dfs(int [] prices , int i,boolean buy){
       if(i>=prices.length) return 0;
       int cooldown = dfs(prices,i+1,buy);
       if(buy){
        int b = dfs(prices,i+1,false)-prices[i];
        return Math.max(b,cooldown);
       } 
       else{
        int s = dfs(prices,i+2,true)+prices[i];
        return Math.max(s,cooldown);
       }
    }
}
