import java.util.Arrays;

class Solution {
    public long maximumScore(int[][] grid) {
        int n = grid.length;

        long[][] pref = new long[n][n + 1];

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                pref[col][row + 1] = pref[col][row] + grid[row][col];
            }
        }

        long[][] nextDp = new long[n + 1][n + 1];

        int lastCol = n - 1;

        for (int left = 0; left <= n; left++) {
            for (int curr = 0; curr <= n; curr++) {
                nextDp[left][curr] = score(pref, lastCol, left, curr, 0);
            }
        }

        for (int col = n - 2; col >= 0; col--) {
            long[][] currDp = new long[n + 1][n + 1];

            for (int curr = 0; curr <= n; curr++) {
                long[] prefixMax = new long[n + 1];
                long[] suffixMax = new long[n + 2];

                prefixMax[0] = nextDp[curr][0];

                for (int h = 1; h <= n; h++) {
                    prefixMax[h] = Math.max(prefixMax[h - 1], nextDp[curr][h]);
                }

                suffixMax[n + 1] = Long.MIN_VALUE / 4;

                for (int h = n; h >= 0; h--) {
                    suffixMax[h] = Math.max(
                        suffixMax[h + 1],
                        nextDp[curr][h] + pref[col][h]
                    );
                }

                for (int left = 0; left <= n; left++) {
                    long best;

                    if (left > curr) {
                        best = pref[col][left] - pref[col][curr] + prefixMax[left];

                        if (left + 1 <= n) {
                            best = Math.max(
                                best,
                                suffixMax[left + 1] - pref[col][curr]
                            );
                        }
                    } else {
                        best = prefixMax[curr];

                        if (curr + 1 <= n) {
                            best = Math.max(
                                best,
                                suffixMax[curr + 1] - pref[col][curr]
                            );
                        }
                    }

                    currDp[left][curr] = best;
                }
            }

            nextDp = currDp;
        }

        long ans = 0;

        for (int h = 0; h <= n; h++) {
            ans = Math.max(ans, nextDp[0][h]);
        }

        return ans;
    }

    private long score(long[][] pref, int col, int leftHeight, int currHeight, int rightHeight) {
        int maxNeighborHeight = Math.max(leftHeight, rightHeight);

        if (maxNeighborHeight <= currHeight) {
            return 0;
        }

        return pref[col][maxNeighborHeight] - pref[col][currHeight];
    }
}
