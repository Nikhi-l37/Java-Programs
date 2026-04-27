import java.util.*;

class Solution {
    private final int[][][] directions = {
        {}, 
        {{0, -1}, {0, 1}},   // 1: left, right
        {{-1, 0}, {1, 0}},   // 2: up, down
        {{0, -1}, {1, 0}},   // 3: left, down
        {{0, 1}, {1, 0}},    // 4: right, down
        {{0, -1}, {-1, 0}},  // 5: left, up
        {{0, 1}, {-1, 0}}    // 6: right, up
    };

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];

            if (r == m - 1 && c == n - 1) {
                return true;
            }

            int streetType = grid[r][c];

            for (int[] dir : directions[streetType]) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                    if (canConnect(nr, nc, r, c, grid)) {
                        visited[nr][nc] = true;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }

        return false;
    }

    private boolean canConnect(int nextR, int nextC, int currR, int currC, int[][] grid) {
        int nextStreet = grid[nextR][nextC];

        for (int[] dir : directions[nextStreet]) {
            if (nextR + dir[0] == currR && nextC + dir[1] == currC) {
                return true;
            }
        }

        return false;
    }
}
