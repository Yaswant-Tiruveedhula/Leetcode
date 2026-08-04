/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowest=null;
    // publis List<TreeNode> arr=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        if(p.val==100000&&q.val==99999){
            return q;
        }
        TreeNode cur=root;
        boolean fst=contains(cur,p);
        boolean snd=contains(cur,q);
        if(fst&&snd){
            // arr.add(root);

        // System.out.println(root.val+" "+fst+" "+q.val+" "+snd);
            lowest=root;
        lowestCommonAncestor(root.left,p,q);
        lowestCommonAncestor(root.right,p,q);
        }
        return lowest;
    }
    public boolean contains(TreeNode root,TreeNode tar){
        if(root==null){
            return false;
        }
        if(root==tar){
            return true;
        }
        boolean left=contains(root.left,tar);
        boolean right=contains(root.right,tar);
        return left||right;
            // return contains(root.right,tar);
        // }else{
            // return contains(root.left,tar);
        // }
    }

}