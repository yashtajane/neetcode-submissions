class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
    //    int currentNum =  ;
    //    int missingNum = 0 ; int count = 0 ;
       
       for(int i = 0 ; i < nums.length ; i++){
           if(nums[i]!=i){
            return i ;
           }
       }
         return  nums.length ; 
    }
}
