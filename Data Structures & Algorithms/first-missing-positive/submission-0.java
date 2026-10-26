class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int curr = 1;
        for(int num : nums){
           if(num==curr) curr++;
         }
          return curr;
    }
}