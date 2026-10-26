class Solution {
    Set<Integer>pd = new HashSet<>();
    Set<Integer>nd = new HashSet<>();
    Set<Integer>col = new HashSet<>();
    int res=0;
    public int totalNQueens(int n) {
         bt(n,0);
        return res;
    }
    public void bt(int n,int r){
        if(r==n){
            res++;
            return;
        }
         for (int c = 0; c < n; c++) {
        if(pd.contains(r+c) || nd.contains(r-c) || col.contains(c) ) 
        continue;

        pd.add(r+c);
        nd.add(r-c);
        col.add(c);
        bt(n,r+1);
        col.remove(c);
        pd.remove(r + c);
        nd.remove(r - c);
    }
}
}