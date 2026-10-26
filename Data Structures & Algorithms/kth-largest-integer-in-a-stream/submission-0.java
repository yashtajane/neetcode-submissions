class KthLargest {
     int K;
     List<Integer> a;
    public KthLargest(int k, int[] nums) {
        K = k;
        a = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            a.add(nums[i]);
        }

    }
    
    public int add(int val) {
        a.add(val);
        Collections.sort(a);
        return a.get(a.size()-K);
        
    }
}
