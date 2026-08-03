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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<TreeNode> que=new ArrayDeque<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode now=null;
            int k=que.size();
            for(int i=0;i<k;i++){
                now=que.poll();
                if(now.left!=null){
                    que.offer(now.left);
                }
                if(now.right!=null){
                    que.offer(now.right);
                }
            }
            arr.add(now.val);
        }
        return arr;
    }
}