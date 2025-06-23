
class Solution {
    public double findMaxAverage(int[] nums, int k) {

      int start= 0;
      int end = k-1;
      int n = nums.length;
      int sum =0;
      int maxSum=Integer.MIN_VALUE;

      for(int i=0 ;i <k;i++)
    {
         sum=sum+nums[i];
    }

    maxSum = sum;

    while(end<n){
       

        end++;
        if(end==n) break;

        sum=sum+nums[end];
        
        sum-=nums[start];
        start++;

        maxSum= Math.max(maxSum,sum);
    }
      
      double d= maxSum*1.0/k;
      return d;
   
    } 
    
}