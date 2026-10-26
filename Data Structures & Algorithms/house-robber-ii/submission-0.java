class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0],Math.max(help(Arrays.copyOfRange(nums,0,nums.length-1)),help(Arrays.copyOfRange(nums,1,nums.length))));
    }
    public int help(int []nums){
        int r1=0,r2=0;
        for(int num : nums){
           
            int temp = Math.max(r1+num,r2);
            r1=r2;
            r2=temp;
          
        }
        return r2 ;
    }
}
