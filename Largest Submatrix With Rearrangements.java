import java.util.Arrays;

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;

        // Step 1: Update the matrix to store heights of consecutive 1s
        for (int r = 1; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == 1) {
                    matrix[r][c] += matrix[r - 1][c];
                }
            }
        }

        // Step 2: For each row, sort heights and find the max area
        for (int r = 0; r < m; r++) {
            // We clone the row or use a temporary array to avoid 
            // breaking the height logic for the next row
            int[] currentRow = matrix[r].clone();
            Arrays.sort(currentRow);

            // Step 3: Calculate area from tallest to shortest
            for (int i = 0; i < n; i++) {
                int height = currentRow[n - 1 - i];
                int width = i + 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        return maxArea;
    }
}
