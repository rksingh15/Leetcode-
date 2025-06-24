class Solution {
    public void moveZeroes(int[] nums) {
        int jj[]  = new int[nums.length];

        int zero =0;
        int kk=0;
        for(int  i =0; i< nums.length; i++)
        {
            if(nums[i]==0)
            {
                zero ++;

            }
            else jj[kk++]=nums[i];
        }
        int index=0;
        int bb=nums.length;
        while(bb>0)
        {
            nums[index]=jj[index];
            index++;
            --bb;
        }
        int ww= bb;
        while(ww>0)
        {
            nums[index]=0;
            index++;
            ww--;
        }


    }
}