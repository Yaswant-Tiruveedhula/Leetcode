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
    int tilt=0;
    public int findTilt(TreeNode root) {
        if(root==null){
            return 0;
        }
        int k=summ(root);
        return tilt;
    }
    public int summ(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum=summ(root.left);
        int rightsum=summ(root.right);
        this.tilt+=Math.abs(leftsum-rightsum);
        return leftsum+rightsum+root.val;
        

    }

}