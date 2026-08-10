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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> que=new ArrayDeque<>();
        if(root==null){
            return 0;
        }
        que.offer(root);
        int dep=1;
        while(!que.isEmpty()){
            int k=que.size();
            for(int i=0;i<k;i++){
                TreeNode cur=que.poll();
                if(cur.left==null&&cur.right==null){
                    return dep;
                }
                if(cur.left!=null){
                    que.offer(cur.left);
                }
                if(cur.right!=null){
                    que.offer(cur.right);
                }
            }
            dep++;
        }
        return dep;
    }
}