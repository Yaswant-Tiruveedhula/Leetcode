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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> que=new ArrayDeque<>();
        que.offer(root);
        int level=1;
        int pre=1;
        int max=root.val;
        while(!que.isEmpty()){
            
            int k=que.size();
            int sum=0;
            for(int i=0;i<k;i++){
                TreeNode now=que.poll();
                sum+=now.val;
                if(now.left!=null){
                    que.offer(now.left);
                }
                if(now.right!=null){
                    que.offer(now.right);
                }
            }
            if(sum>max){
                max=sum;
                pre=level;
            }
            level++;
        }
        return pre;
    }
}