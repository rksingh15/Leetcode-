class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n  = arr.length;
        int a=0;
        int idx=0;

        for(int i = 0 ;i<n;i++)
        {
            if(arr[i]>a){
            a=arr[i];
            idx=i;
            }
        }

        return idx;
    }
}