class Solution {
    int [][] dd = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS=heights.length;
        int COLS=heights[0].length;
        boolean [][] p = new boolean[ROWS][COLS];
        boolean [][] a = new boolean[ROWS][COLS];
        for(int c=0;c<COLS;c++){
           dfs(0,c,p,heights);
           dfs(ROWS-1,c,a,heights);
        }
        for(int r=0;r<ROWS;r++){
            dfs(r,0,p,heights);
            dfs(r,COLS-1,a,heights);
        }
        List<List<Integer>>res=new ArrayList<>();
        for(int r = 0 ; r<ROWS ; r++){
            for(int c = 0 ; c< COLS ; c++){
                if(p[r][c] && a[r][c]){
                    res.add(Arrays.asList(r,c));
                }
            }
        }
        return res ;
    }
    public void dfs(int r , int c , boolean [][] ocean , int[][] heights){
        ocean[r][c]=true;
        for(int[] d : dd){
            int nr = r+d[0]; int nc=c+d[1];
        if( nr>=0 && nr<heights.length && nc>=0 && nc<heights[0].length && !ocean[nr][nc]
        && heights[nr][nc]>=heights[r][c]){
            dfs(nr,nc,ocean,heights);
        }
    }
    }
}
