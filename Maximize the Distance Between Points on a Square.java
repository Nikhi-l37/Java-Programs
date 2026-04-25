import java.util.*;

class Solution {
    public int maxDistance(int side, int[][] points, int k) {
        int n = points.length;
        long perimeter = 4L * side;

        long[] pos = new long[n];

        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];

            if (y == 0) {
                pos[i] = x;
            } else if (x == side) {
                pos[i] = (long) side + y;
            } else if (y == side) {
                pos[i] = 3L * side - x;
            } else {
                pos[i] = 4L * side - y;
            }
        }

        Arrays.sort(pos);

        int low = 1;
        int high = side;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (can(pos, k, mid, perimeter)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean can(long[] pos, int k, int dist, long perimeter) {
        int n = pos.length;

        long[] arr = new long[2 * n];

        for (int i = 0; i < n; i++) {
            arr[i] = pos[i];
            arr[i + n] = pos[i] + perimeter;
        }

        int[] next = new int[2 * n];
        int j = 0;

        for (int i = 0; i < 2 * n; i++) {
            if (j <= i) {
                j = i + 1;
            }

            while (j < 2 * n && arr[j] - arr[i] < dist) {
                j++;
            }

            next[i] = j;
        }

        for (int start = 0; start < n; start++) {
            int curr = start;
            boolean ok = true;

            for (int count = 1; count < k; count++) {
                curr = next[curr];

                if (curr >= start + n) {
                    ok = false;
                    break;
                }
            }

            if (ok && arr[start] + perimeter - arr[curr] >= dist) {
                return true;
            }
        }

        return false;
    }
}
