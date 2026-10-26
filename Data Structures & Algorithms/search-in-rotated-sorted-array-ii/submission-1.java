class Solution {
    public boolean search(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++ ){
            int curr = nums[i];
            if(curr==target) return true ;
             }
        return false ;
    }
}