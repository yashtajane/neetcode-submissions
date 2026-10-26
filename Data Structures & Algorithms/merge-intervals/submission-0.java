class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       List<int[]>op = new ArrayList<>();
       op.add(intervals[0]);
       for(int [] interval : intervals){
        int s = interval[0];
        int e = interval[1];
        int fe = op.get(op.size()-1)[1];
        if(s<=fe){
            op.get(op.size()-1)[1]=Math.max(e,fe);
        }
        else{
            op.add(new int[]{s,e});
        }
       } 

       return op.toArray(new int[op.size()][]);
    }
}
