/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{root.val};
        dfs(root,res);
        return res[0];
    }
    public int getMax(TreeNode root){
        if(root == null) return 0;
        int left = getMax(root.left);
        int right = getMax(root.right);

        int path = Math.max(0,root.val+Math.max(left,right));

        return path;
    }
    public void dfs(TreeNode root, int[]res){
        if(root==null) return ;
        int left = getMax(root.left);
        int right = getMax(root.right);

        res[0] = Math.max(res[0],root.val+left+right);

        dfs(root.left,res);
        dfs(root.right,res);
    } 

}
