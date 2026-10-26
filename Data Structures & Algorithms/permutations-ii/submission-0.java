class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>>res = new HashSet<>();
        bt(res,nums,new ArrayList<>());
        return new ArrayList<>(res);
    }
    public void bt(Set<List<Integer>>res,int[] nums,List<Integer>perm){
        if(perm.size()==nums.length){
            res.add(new ArrayList<>(perm));
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=Integer.MIN_VALUE){
                int t = nums[i];
                perm.add(nums[i]);
                nums[i]=Integer.MIN_VALUE;
                bt(res,nums,perm);
                nums[i]=t;
                perm.remove(perm.size()-1);
                // bt(res,nums,perm);
            }
        }
    }
}