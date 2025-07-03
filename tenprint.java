class tenprint
{
  public static  void print(int x)
    {
        
        if(x==0)
        {
            return;
        }
       
        
        print(x-1);
        if((x & 1)==0){
         System.out.println(x);
        }
    }



    public static void main(String[] o)
    {
        System.out.println("Number : ->");
        print(10);

    }
}