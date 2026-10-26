/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return dfs(grid,grid.length,0,0);
    }
    public Node dfs(int[][] grid,int n,int r,int c){
        boolean aS=true;
        for(int i = 0 ;i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[r][c]!=grid[r+i][c+j]) aS=false;
            }
        }
        if(aS){
            return new Node(grid[r][c]==1,true);
        }
        else{
            int mid=n/2;
            Node tL=dfs(grid,mid,r,c);
            Node tR=dfs(grid,mid,r,c+mid);
            Node bL=dfs(grid,mid,r+mid,c);
            Node bR=dfs(grid,mid,r+mid,c+mid);

            return new Node(false,false,tL,tR,bL,bR);
        }
    }
}