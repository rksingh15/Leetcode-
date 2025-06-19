class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int []jj = new int[nums.length];
        ArrayList<Integer> aa = new ArrayList<>();
        for(int i =0 ; i< nums.length;i++){
         aa.add(index[i],nums[i]);
     
        }
        for(int i =0 ; i< nums.length;i++){
         
        jj[i]=aa.get(i);
        }
        return jj;
    }