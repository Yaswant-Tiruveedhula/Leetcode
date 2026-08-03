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
    public int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // int right=right(root.right);
        // int left=right(root.left);
        right(root);
        return diameter;
    }
    public int right(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=right(root.left);
        int right=right(root.right);
        this.diameter=Math.max(diameter,left+right);
        return Math.max(left,right)+1;
    }
    // public int left(TreeNode root,int val){
    //     if(root==null){
    //         return val;
    //     }
    //     int left=left(root.left,val+1);
    //     int right=left(root.right,val+1);
    //     return Math.max(left,right);
    // }

}