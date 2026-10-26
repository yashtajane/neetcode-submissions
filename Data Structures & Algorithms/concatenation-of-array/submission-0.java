class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] dd = new int[2*nums.length];
       for(int i = 0 ; i<dd.length ; i++){
        for(int num : nums){
            dd[i]=num;
            i++;
        }
        for(int num : nums){
            dd[i]=num;
            i++;
        }
       }
       return dd;
    }
}