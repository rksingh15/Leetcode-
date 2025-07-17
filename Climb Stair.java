class Solution {

    int climb(int start, int end, int dp[]) {
        // if(start==end)
        // {
        //     return 1;
        // }
        // if(start==end-1)
        // {
        //     return 1;
        // }  /// base case hoga 
        //Wohi dp ka initilization hota ............
        // fill the dp 

        // phrle to puri array me - kar deege

        if (dp[start] != -1) {
            return dp[start];
        }

        return dp[start] = climb(start + 1, end,dp) + climb(start + 2, end,dp);
    }

    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[n] = 1;
        dp[n - 1] = 1;

        climb(0, n, dp);

        return dp[0];

    }
}
