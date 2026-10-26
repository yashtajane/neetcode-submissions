class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            int crs = 0, j=i;
            while(j<nums.length){
               crs+=nums[j];
               if(crs>=target){
                res= Math.min(res,j-i+1);
               }
               j++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}