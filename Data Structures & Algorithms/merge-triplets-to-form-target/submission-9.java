class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] result = new int[3];
        // boolean valid = true ;
        for( int[]  t : triplets){
            boolean valid = true ;
           for(int i = 0 ; i<t.length ; i++){
            if(t[i]>target[i]){
                valid=false;
                break ;
            }}
            
            if(valid){
                for(int i = 0 ; i<t.length ; i++){
                    if(t[i]==target[i])
                     result[i]=t[i];
            }
           }
        }
        // long nonZeroCount = Arrays.stream(result).filter(i -> i != 0).count();
        return Arrays.equals(result,target) ;
    }
}
