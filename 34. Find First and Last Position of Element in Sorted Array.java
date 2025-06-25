class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int arr[]= new int [2];
        int one =-1;
        int two =-1;
        for(int i =0;i<n;i++)
        {
            if(nums[i]==target)
            {
                one=i;
                break;

            }
        }
            for(int i =n-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                two=i;
                break;

            }
        }
        arr[0]=one;
        arr[1]=two;
        return arr;
    }
}