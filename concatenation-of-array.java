class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int arr[]= new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i+n]=arr[i]=nums[i] ;

        }
       
        return arr;
    }
}