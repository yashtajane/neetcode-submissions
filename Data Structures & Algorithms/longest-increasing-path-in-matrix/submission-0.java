class Solution {
    int [][] dd = {{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
       int ROWS=matrix.length;int COLS=matrix[0].length;
       int lp=0;
       for(int i=0;i<ROWS;i++){
        for(int j=0;j<COLS;j++){
            lp=Math.max(lp,dfs(i,j,matrix,Integer.MIN_VALUE));
        }
       }
       return lp; 
    }
    public int dfs(int r,int c ,int[][] matrix,int prevl){
        if(r<0 || c<0 || r>=matrix.length || c>=matrix[0].length || matrix[r][c]<=prevl){
            return 0;
        }
        int res = 1;
        for(int[] d : dd){
          res = Math.max(res,1 + dfs(r+d[0],c+d[1],matrix,matrix[r][c]));
        }
        return res ;
    }
}
