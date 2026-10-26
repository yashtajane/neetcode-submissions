class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int result = 0 ;
        int pe = intervals[0][1];
       
        // List<int[]> op = new ArrayList<>();
        // op.add(intervals[0]);
        for(int i = 1 ; i<intervals.length ; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            // int fe = op.get(op.size()-1 [1]);
            if(s<pe){
                result++;
                pe=Math.min(e,pe); 
            }
            else{
                pe=e;
            }
        }

        return result;
    }
}
