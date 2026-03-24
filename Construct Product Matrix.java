class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] p = new int[n][m];
        int mod = 12345;

        long runningProduct = 1;

        // Step 1: Calculate prefix products
        // Store the product of all elements appearing before grid[i][j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = (int) runningProduct;
                runningProduct = (runningProduct * (grid[i][j] % mod)) % mod;
            }
        }

        runningProduct = 1;

        // Step 2: Multiply by suffix products
        // Multiply the current prefix by the product of all elements appearing after grid[i][j]
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                p[i][j] = (int) ((p[i][j] * runningProduct) % mod);
                runningProduct = (runningProduct * (grid[i][j] % mod)) % mod;
            }
        }

        return p;
    }
}
