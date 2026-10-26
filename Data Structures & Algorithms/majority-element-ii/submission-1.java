class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> set :
             count.entrySet()) {
                if(set.getValue()>nums.length/3){
                   res.add(set.getKey());
                }
             }

             return res;

    }
}