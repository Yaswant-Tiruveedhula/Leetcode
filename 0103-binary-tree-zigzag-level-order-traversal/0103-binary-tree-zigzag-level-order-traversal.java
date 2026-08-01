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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> dq=new ArrayDeque<>();
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res=new ArrayList<>();
        boolean rev=false;
        dq.offer(root);
        while(!dq.isEmpty()){
            System.out.println(dq);
            int k=dq.size();
            List<Integer> arr=new ArrayList<>();
            if(rev==true){
                for(int i=0;i<k;i++){
                    TreeNode now=dq.pollLast();
                    arr.add(now.val);
                    if(now.right!=null){
                        dq.offerFirst(now.right);
                    }
                    if(now.left!=null){
                        dq.offerFirst(now.left);
                    }
                }
                rev=false;

            }else{
                for(int i=0;i<k;i++){
                    TreeNode now=dq.pollFirst();
                    arr.add(now.val);
                    if(now.left!=null){
                        dq.offerLast(now.left);
                    }
                    if(now.right!=null){
                        dq.offerLast(now.right);
                    }
                }
                rev=true;
            }
            // System.out.println(arr);
            res.add(arr);
        }
        return res;
    }
}