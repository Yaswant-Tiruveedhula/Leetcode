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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        int level=0;
        while(!que.isEmpty()){
            int k=que.size();
            for(int i=0;i<k;i++){
            TreeNode now=que.poll();
            
            if(now.left!=null){
                que.offer(now.left);
            }
            if(now.right!=null){
                que.offer(now.right);
            }
            }
            level++;
        }
        return level;
    }
}