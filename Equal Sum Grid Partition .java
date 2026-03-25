class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long totalSum = 0;

        // Calculate total sum of the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += grid[i][j];
            }
        }

        // If total sum is odd, we can't split it into two equal parts
        if (totalSum % 2 != 0) {
            return false;
        }

        long target = totalSum / 2;

        // Check horizontal cuts (between rows)
        long rowSumAccumulator = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                rowSumAccumulator += grid[i][j];
            }
            if (rowSumAccumulator == target) {
                return true;
            }
        }

        // Check vertical cuts (between columns)
        long colSumAccumulator = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                colSumAccumulator += grid[i][j];
            }
            if (colSumAccumulator == target) {
                return true;
            }
        }

        return false;
    }
}
