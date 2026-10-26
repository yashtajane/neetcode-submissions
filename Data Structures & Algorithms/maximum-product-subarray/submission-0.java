class Solution {
    public int maxProduct(int[] nums) {
        int pre = 0;
        int suf= 0;
        
        int res = nums[0] ;
        for(int i=0 ; i<nums.length ; i++){
            pre=nums[i]*(pre==0? 1:pre);
            suf=nums[nums.length-i-1]*(suf==0? 1:suf);
            res=Math.max(res,Math.max(pre,suf));
        }
        return res ;
    }
}
