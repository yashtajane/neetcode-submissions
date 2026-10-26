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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
         List <String> res = new ArrayList<>();
        Sdfs(root,res);
        return String.join(",",res);
        
    }
    
    public void Sdfs(TreeNode node , List<String> res){
           if(node == null ){ res.add("N"); return;}
           res.add(String.valueOf(node.val));
           
           Sdfs(node.left,res);
           Sdfs(node.right,res);
        //    return res;
    }
 
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // if(root)
        String [] val = data.split(",");
        int [] i = {0};
        return Ddfs(val,i);
        
    }
       public TreeNode Ddfs(String[] val, int[] i ){
        if(val[i[0]].equals("N")) {i[0]++; return null;}
        TreeNode node = new TreeNode(Integer.parseInt(val[i[0]]));
        i[0]++;
        node.left = Ddfs( val,i);
        node.right = Ddfs( val,i);
        return node;
    }
}
