class Solution {
    public int maxChocolate(int grid[][]) {
        int n = grid.length;
        int m = grid[0].length;
        
        // dp[i][j1][j2] stores max chocolates from row i with robots at j1 and j2
        int[][][] dp = new int[n][m][m];

        // 1. Initialize the last row (Base Case)
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2) {
                    dp[n - 1][j1][j2] = grid[n - 1][j1];
                } else {
                    dp[n - 1][j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
                }
            }
        }

        // 2. Fill the DP table from bottom to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    
                    int maxNext = -1;

                    // Explore 9 combinations of moves for Robot 1 and Robot 2
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int nj1 = j1 + di;
                            int nj2 = j2 + dj;

                            // Check boundaries for the next row's columns
                            if (nj1 >= 0 && nj1 < m && nj2 >= 0 && nj2 < m) {
                                maxNext = Math.max(maxNext, dp[i + 1][nj1][nj2]);
                            }
                        }
                    }

                    // Add chocolates from current cells
                    int currentVal = (j1 == j2) ? grid[i][j1] : grid[i][j1] + grid[i][j2];
                    
                    if (maxNext != -1) {
                        dp[i][j1][j2] = currentVal + maxNext;
                    } else {
                        dp[i][j1][j2] = (int)-1e8; 
                    }
                }
            }
        }

        // Return starting positions: Robot 1 at (0,0) and Robot 2 at (0, m-1)
        return dp[0][0][m - 1];
    }
}
