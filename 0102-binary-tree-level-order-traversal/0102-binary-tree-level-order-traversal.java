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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> que=new ArrayDeque<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> part=new ArrayList<>();
            int k=que.size();
            for(int i=0;i<k;i++){
                TreeNode present=que.poll();
                part.add(present.val);
                if(present.left!=null){
                    que.offer(present.left);
                }
                if(present.right!=null){
                    que.offer(present.right);
                }
            }
            res.add(part);
        }
        return res;
    }
}