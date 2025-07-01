// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
         int idx=0;
         
         int s1=0;
         int s2=0;
         
         int len1=a.length;
         int len2=b.length;
         
         int kk[]= new int [len1+len2];
         
         while (s1<len1 && s2<len2)
         {
             if(a[s1]<=b[s2])
             {
                 kk[idx]=a[s1];
                 idx++;
                 s1++;
             }else{
                 kk[idx]=b[s2];
                 idx++;
                 s2++;
             }
         }
         
         while(s1<len1)
         {
             kk[idx]=a[s1];
             idx++;
             s1++;
         }
         while(s2<len2)
         {
             kk[idx]=b[s2];
             idx++;
             s2++;
         }
         int o=0;
         int p=0;
         for(int i=0 ;i<kk.length;i++)
         {
             if(i<len1)
             {
                 a[o++]=kk[i];
             }
             else
             {
                 
                 b[p++]=kk[i];
             }
         }
         
    }
}
