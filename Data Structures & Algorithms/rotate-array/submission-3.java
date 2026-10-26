class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k=k%n;
       reverseArr(nums,0,n-1);
       reverseArr(nums,0,k-1);
       reverseArr(nums,k,n-1);
    }
    public void reverseArr(int[] nums,int left,int right){
        
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}