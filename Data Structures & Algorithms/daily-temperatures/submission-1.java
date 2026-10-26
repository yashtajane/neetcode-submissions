class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int [] res = new int [temperatures.length] ;
    
        for(int i = 0 ; i < temperatures.length ; i++ ){
            int max = 0 ;
            for(int j=i+1 ; j<temperatures.length ; j++){
                   if (temperatures[i] >= temperatures[j]){
                          max++;
                   }
                   else{
                    max++;
                    res[i] = max ;
                    break;
                   }
            }
        }

        return res ;
    }
}
