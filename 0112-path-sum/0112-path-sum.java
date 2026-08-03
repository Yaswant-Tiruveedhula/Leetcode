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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return found(root,targetSum);
    }
    public boolean found(TreeNode root,int val){
        if(root==null){
            return false;
        }
       
            if(root.left==null&&root.right==null){
                 return val-root.val==0;
            }
        
        val=val-root.val;
        boolean left=found(root.left,val);
        boolean right=found(root.right,val);
        return (left||right);
            // return (found(root.left,val)||found(root.right,val));
        // }

    
}
}