class Solution {

    Set<Integer> posiD = new HashSet<>();
        Set<Integer> negD = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(char[] row : board){
              Arrays.fill(row, '.');
        }
       bt(board,0,n);
    return res ;
    }
    
    public void bt(char[][] board , int r , int n){
        for(int c = 0 ; c<n ; c++){
        if(r==n){
            List<String> copy = new ArrayList<>();
            for(char[] rr : board){
                copy.add(new String(rr));
            }
            res.add(copy);
            return ;
        }
        if(col.contains(c) || posiD.contains(r+c) || negD.contains(r-c)) continue ;
        col.add(c);
        posiD.add(r+c);
        negD.add(r-c);
        board[r][c]='Q';
        bt(board,r+1,n);
        col.remove(c);
        posiD.remove(r+c);
        negD.remove(r-c);
        board[r][c]='.';
        }
    }
}
