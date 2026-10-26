class Solution {
    public int[] twoSum(int[] numbers, int target) {
      
      int[] res = new int[2];
    //   int a = 1;

      for(int a=0;a<numbers.length;a++){
        for(int i=a+1 ; i<numbers.length; i++){
            if(numbers[a]+numbers[i]==target){
                res[0]=a+1; res[1]=i+1;
            }
        }
      }

      return res;  
    }
}
