import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        int totalElements = m * n;
        int[] flattened = new int[totalElements];

        int firstVal = grid[0][0];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((grid[i][j] - firstVal) % x != 0) {
                    return -1;
                }

                flattened[index++] = grid[i][j];
            }
        }

        Arrays.sort(flattened);

        int median = flattened[totalElements / 2];
        int operations = 0;

        for (int val : flattened) {
            operations += Math.abs(val - median) / x;
        }

        return operations;
    }
}
