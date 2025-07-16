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


    void inOrder(TreeNode root,ArrayList<Integer> a)
    {
         TreeNode curr=root;
        if(root==null)
        {
            return ;
        }
        inOrder(curr.left,a);
        a.add(curr.val);
        inOrder(curr.right,a);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a =new ArrayList<>();
        inOrder( root, a);

        int n = k-1;

        return a.get(n);


    }
}
