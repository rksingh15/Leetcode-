class Solution {
    public int[] runningSum(int[] nums)
    {
        int n = nums.length;
        int Keepsum[] = new int[n];
        Keepsum[0]=nums[0];
        for(int i =1 ;i<n;i++)
        {
            Keepsum[i]=Keepsum[i-1]+nums[i];

        }
        return Keepsum;
    }
}
/*
int sum=0
for(int i=0)
sum=sum + nums[i];
Keepsum[i]=sum;