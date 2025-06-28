class Solution {

    
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int n = c.length;
        List<Boolean> take = new ArrayList<>();
        int Max=Integer.MIN_VALUE;
        for(int i = 0; i < n;i++)
        {
           Max= Math.max(Max,c[i]);
        }
        for(int i = 0; i < n;i++)
        {
            int a=c[i]+e;
            if(a>=Max)
            {
               
                take.add(true);
               
            }
            if(c[i]+e<Max){
                
                
                take.add(false);
                
            } 
        }
        return take;

    }
}