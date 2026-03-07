class Solution {
    static long noOfWays(int m, int n, int x) {
        // dp[i][j] stores ways to get sum j with i dice
        long[][] dp = new long[n + 1][x + 1];

        // Base case: 0 dice can only form sum 0
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                // Try every face value from 1 to m
                for (int k = 1; k <= m; k++) {
                    if (j >= k) {
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }
        return dp[n][x];
    }
}
