class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length(),n=t.length();
        return dfs(s,t,m,n,0,0);
    }
    public int dfs(String s , String t , int m , int n , int i , int j){
        if(j==n) return 1 ;
        if(i==m) return 0 ;
        int res = dfs(s,t,m,n,i+1,j);
        if(s.charAt(i)==t.charAt(j)) res+=dfs(s,t,m,n,i+1,j+1);
        return res ;
    }
}
