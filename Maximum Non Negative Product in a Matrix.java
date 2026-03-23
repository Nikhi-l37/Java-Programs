class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long[][] maxDP = new long[m][n];
        long[][] minDP = new long[m][n];

        // Initialize starting point
        maxDP[0][0] = minDP[0][0] = grid[0][0];

        // Fill first column
        for (int i = 1; i < m; i++) {
            maxDP[i][0] = minDP[i][0] = maxDP[i - 1][0] * grid[i][0];
        }

        // Fill first row
        for (int j = 1; j < n; j++) {
            maxDP[0][j] = minDP[0][j] = maxDP[0][j - 1] * grid[0][j];
        }

        // Fill the rest of the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] >= 0) {
                    maxDP[i][j] = Math.max(maxDP[i - 1][j], maxDP[i][j - 1]) * grid[i][j];
                    minDP[i][j] = Math.min(minDP[i - 1][j], minDP[i][j - 1]) * grid[i][j];
                } else {
                    maxDP[i][j] = Math.min(minDP[i - 1][j], minDP[i][j - 1]) * grid[i][j];
                    minDP[i][j] = Math.max(maxDP[i - 1][j], maxDP[i][j - 1]) * grid[i][j];
                }
            }
        }

        long res = maxDP[m - 1][n - 1];
        return res < 0 ? -1 : (int) (res % 1000000007);
    }
}
