class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        
        // dp[i][j][k] = max coins at (i, j) with k neutralizations REMAINING
        // k can be 0, 1, or 2.
        long[][][] dp = new long[m][n][3];
        
        // Initialize with a very small number to represent unvisited states
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Long.MIN_VALUE;
                }
            }
        }

        // Base case: Starting cell (0, 0)
        // Option 1: Don't neutralize
        dp[0][0][2] = coins[0][0];
        // Option 2: Neutralize (if negative)
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2; k++) {
                    if (dp[i][j][k] == Long.MIN_VALUE) continue;

                    // Move Right or Down
                    int[][] dirs = {{0, 1}, {1, 0}};
                    for (int[] d : dirs) {
                        int ni = i + d[0], nj = j + d[1];
                        if (ni < m && nj < n) {
                            // Option A: Gain/Lose coins normally
                            dp[ni][nj][k] = Math.max(dp[ni][nj][k], dp[i][j][k] + coins[ni][nj]);

                            // Option B: Neutralize if negative and neutralizations remain
                            if (k > 0 && coins[ni][nj] < 0) {
                                dp[ni][nj][k - 1] = Math.max(dp[ni][nj][k - 1], dp[i][j][k]);
                            }
                        }
                    }
                }
            }
        }

        // The answer is the max value at the bottom-right cell across all k
        long result = Math.max(dp[m - 1][n - 1][0], 
                      Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
        
        return (int) result;
    }
}
