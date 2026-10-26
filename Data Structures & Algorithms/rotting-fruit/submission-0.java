class Solution {
    Queue<int[]> q = new ArrayDeque<>();
    public int orangesRotting(int[][] grid) {
        int[][] dd = {{1,0},{-1,0},{0,1},{0,-1}};
        int fresh = 0;
        int time = 0;
        for(int r = 0 ; r<grid.length ; r++){
            for(int c=0 ; c<grid[0].length ; c++){
                if(grid[r][c]==1) fresh++;
                if(grid[r][c]==2) q.offer(new int[]{r,c});
            }
        }
        while(fresh>0 && !q.isEmpty()){
            int length = q.size() ;

            for(int i = 0 ; i<length ; i++){
            int[] cur = q.poll();
            int rr = cur[0];
            int cc = cur[1];
                
     for(int [] d : dd){
      int rrr = rr + d[0];
      int ccc = cc + d[1];
     if(rrr>=0 && ccc>=0 && rrr<grid.length && ccc<grid[0].length && grid[rrr][ccc]==1){
     grid[rrr][ccc]=2;
      q.offer(new int[]{rrr, ccc});
         fresh--;
                    }
                }
            }
            time++;
        }
        return fresh==0? time:-1 ;
    }
}
