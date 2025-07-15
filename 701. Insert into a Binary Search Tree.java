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
    

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr = root;
        if(root==null)
        {
            return new TreeNode(val);
        }
       while(true)
       {
        if(curr.val < val)
        {
             if(curr.right==null) // yadi null hua to insert kar denge
            {
                curr.right = new TreeNode(val);
                break;
            }
            curr = curr.right;
        }
        else{
            if(curr.left==null) // yadi null hua to insert kar denge
            {
                curr.left = new TreeNode(val);
                break;
            }
            curr =curr.left;
        }
       }
       return root;
    }
}
