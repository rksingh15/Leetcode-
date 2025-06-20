class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

       ArrayList<Integer> Ok = new ArrayList<>();
       int n = nums.length;
       int flag=0;
       for(int i = 0; i< n; i++)
       {
        
         for(int j = 0; j< n; j++)
         {
            
            if(nums[i]>nums[j])
            {
                flag++;
               
            }
           
            

         }
           Ok.add(flag);
           flag=0;
         
         
           
       } 
       flag=0;
       int []Okk =new int[n];
       for(int i = 0; i< n; i++)
       {
            Okk[i]=Ok.get(i);
       }

       return Okk;
    }
}