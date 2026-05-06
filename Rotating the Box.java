class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        // Step 1: Apply Gravity horizontally for each row
        for (int i = 0; i < m; i++) {
            // emptyPos tracks the rightmost available spot for a stone to fall into
            int emptyPos = n - 1; 
            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    // Obstacle resets the potential empty position to the left of it
                    emptyPos = j - 1;
                } else if (boxGrid[i][j] == '#') {
                    // Move stone to the emptyPos and update emptyPos
                    boxGrid[i][j] = '.';
                    boxGrid[i][emptyPos] = '#';
                    emptyPos--;
                }
            }
        }

        // Step 2: Rotate the grid 90 degrees clockwise
        // New dimensions: rows become columns, columns become rows (n x m)
        char[][] rotatedBox = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // The element at (i, j) moves to (j, m - 1 - i)
                rotatedBox[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return rotatedBox;
    }
}
