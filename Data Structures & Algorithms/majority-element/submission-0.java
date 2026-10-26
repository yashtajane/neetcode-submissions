class Solution {
    public int majorityElement(int[] nums) {
        int res = 0 ;
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry :count.entrySet() ){
            if(entry.getValue()>((int)(nums.length/2))){
                res=entry.getKey();
            }
        }
        return res ;
    }
}