import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length;
        
        // Phase 1: Diagonals starting from the top row (j: 0 to n-1)
        for (int j = 0; j < n; j++) {
            int row = 0;
            int col = j;
            // Move diagonally down-left: row increases, col decreases
            while (col >= 0 && row < n) {
                result.add(mat[row][col]);
                row++;
                col--;
            }
        }
        
        // Phase 2: Diagonals starting from the last column (i: 1 to n-1)
        for (int i = 1; i < n; i++) {
            int row = i;
            int col = n - 1;
            // Move diagonally down-left: row increases, col decreases
            while (row < n && col >= 0) {
                result.add(mat[row][col]);
                row++;
                col--;
            }
        }
        
        return result;
    }
}
