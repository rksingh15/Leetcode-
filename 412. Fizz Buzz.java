class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>Take = new ArrayList<>();
        for(int i =  1; i<= n ;i++)
        {
            if(i%3==0&& i%5==0)
            {
                Take.add("FizzBuzz");
            }
             else if(i%3==0)
            {
                Take.add("Fizz");
            }
           else if( i%5==0)
            {
                Take.add("Buzz");
            }
            else{
                
           String strNumber = String.valueOf(i);
                Take.add(strNumber);
            }
        }
        return Take;
    }
}