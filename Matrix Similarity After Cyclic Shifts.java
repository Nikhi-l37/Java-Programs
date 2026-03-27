class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        // A shift of k is effectively k % n
        k %= n;
        if (k == 0) return true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the element at j doesn't match the element k positions away,
                // the row will change after the shift.
                if (mat[i][j] != mat[i][(j + k) % n]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
