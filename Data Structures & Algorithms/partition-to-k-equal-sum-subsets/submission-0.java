class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0 ;
        for(int num : nums){
            sum+=num;
        }
        int n = nums.length;
        if(sum%k !=0 ) return false ;
        Arrays.sort(nums);
        for(int i = 0 ; i<n/2 ; i++){
            int t = nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=t;
        }
        int target = sum/k;
       boolean[] used = new boolean[n];
        return bt(target,nums,0,0,k,used);
    }
    public boolean bt(int target,int[] nums,int start,int cs,int k,
    boolean[] used){
        if(k==0) return true;
        if(cs==target) return bt(target,nums,0,0,k-1,used);
        for(int i=start;i<nums.length;i++){
           if(used[i] || cs+nums[i]>target) continue;
           used[i]=true;
           if( bt(target,nums,i+1,cs+nums[i],k,used)) return true;
           used[i] = false;
        }
        return false;
    }
}