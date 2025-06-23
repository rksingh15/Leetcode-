class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int end = k-1;
        int countVol=0;
        int MaxVol=Integer.MAX_VALUE;

        int n = s.length();

        for(int idx=start; idx<k ; idx++)
        {
            if(isCheck(s.charAt(idx))) countVol++;
        }
        MaxVol = countVol;

        while(end<n){
            end++;
            if(end==n) break;
            if(isCheck(s.charAt(end))) countVol++;

            if(isCheck(s.charAt(start))) countVol--;
            start++;
           MaxVol = Math.max(MaxVol,countVol);
        }

        return  MaxVol;


        
    }

    public boolean isCheck(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}