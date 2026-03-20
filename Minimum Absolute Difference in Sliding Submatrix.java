import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length; // Fixed: was grid.length
        int resM = m - k + 1;
        int resN = n - k + 1;
        int[][] ans = new int[resM][resN];

        for (int i = 0; i < resM; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            
            // 1. Initialize the very first k*k window for this row set (i)
            for (int r = i; r < i + k; r++) {
                for (int c = 0; c < k; c++) {
                    map.put(grid[r][c], map.getOrDefault(grid[r][c], 0) + 1);
                }
            }
            ans[i][0] = calculateMin(map);

            // 2. Slide horizontally
            for (int j = 1; j < resN; j++) {
                for (int r = i; r < i + k; r++) {
                    // Remove the column that is sliding out (j-1)
                    int outVal = grid[r][j - 1];
                    int count = map.get(outVal);
                    if (count == 1) map.remove(outVal);
                    else map.put(outVal, count - 1);

                    // Add the column that is sliding in (j+k-1)
                    int inVal = grid[r][j + k - 1];
                    map.put(inVal, map.getOrDefault(inVal, 0) + 1);
                }
                ans[i][j] = calculateMin(map);
            }
        }
        return ans;
    }

    private int calculateMin(TreeMap<Integer, Integer> map) {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    for (int key : map.keySet()) {
        if (prev != null) {
            min = Math.min(min, key - prev);
        }
        prev = key;
        if (min == 0) return 0;
    }

    return (min == Integer.MAX_VALUE) ? 0 : min;
}
}
