class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visit = new boolean[n][n];
        int t = 0 ;
        return dfs(grid,0,0,t,n,visit);
    }
    public int dfs(int[][] grid,int r,int c,int t, int n, boolean[][] visit){
        if(r<0 || c<0 || r>=n || c>=n || visit[r][c]) return 1000000;
        if(r==n-1 && c==n-1) return Math.max(grid[r][c],t);
       visit[r][c]=true;
        t=Math.max(grid[r][c],t);
        int res = Math.min(Math.min(dfs(grid,r+1,c,t,n,visit),dfs(grid,r-1,c,t,n,visit))
                ,Math.min(dfs(grid,r,c+1,t,n,visit),dfs(grid,r,c-1,t,n,visit)));
  visit[r][c] = false;
                return res ;
    }
}
