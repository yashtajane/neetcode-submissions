class Solution {
    public static final int [][]dd = {{1,0},{-1,0},{0,1},{0,-1}}; 
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS=grid[0].length ;
        int a = 0 ;
        for(int r=0;r<ROWS ; r++){
            for(int c=0; c<COLS ; c++){
                if(grid[r][c]==1){
                    a=Math.max(a,dfs(grid,r,c));
                }
            }
        }
        return a ;
    }
    public int dfs(int [][]grid , int r , int c ){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return 0;
        grid[r][c]=0;
        int res = 1 ;
        for(int [] d : dd){
          res+=dfs(grid,r+d[0],c+d[1]);
        }
       return res ;
    }
}
