
class Solution {
    public int findNumbers(int[] nums) {

        int flag =0;
        for(int i = 0 ; i< nums. length ;i++)
        {
            int a = String.valueOf(nums[i]).length();
            if(a%2==0)
            {
                flag++;
            }

        }
       
        return  flag;
    }
}