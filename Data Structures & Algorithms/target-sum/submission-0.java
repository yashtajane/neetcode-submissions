class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return backtrack(nums,target,0,0);
    }
    public int backtrack(int[] nums,int target,int sum,int i){
         if(i==nums.length) return sum==target?1:0;
     return backtrack(nums,target,sum-nums[i],i+1)+backtrack(nums,target,sum+nums[i],i+1);
      
    }
}