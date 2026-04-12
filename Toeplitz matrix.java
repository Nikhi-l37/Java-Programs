class Solution {
    public boolean isToeplitz(int[][] mat) {
        // Iterate through each row starting from the second row (i=1)
        for (int i = 1; i < mat.length; i++) {
            // Iterate through each column starting from the second column (j=1)
            for (int j = 1; j < mat[i].length; j++) {
                // Check if current element matches the one above and to the left
                if (mat[i][j] != mat[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
