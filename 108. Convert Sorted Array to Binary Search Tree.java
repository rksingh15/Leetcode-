class Solution {
    TreeNode SortADD(int[]nums ,int start ,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=start +(end-start)/2;
         TreeNode head = new TreeNode(nums[mid]);

         head.left =SortADD(nums,start,mid-1);
         head.right =SortADD(nums,mid+1,end);

         return head;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
                return SortADD(nums,0,nums.length-1);

    }
}
