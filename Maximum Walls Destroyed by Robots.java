import java.util.*;

class Solution {
    int[][] memo;
    int[][] robotData;
    int[] walls;
    int n;

    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        this.n = robots.length;
        this.robotData = new int[n][2];
        for (int i = 0; i < n; i++) {
            robotData[i][0] = robots[i];
            robotData[i][1] = distance[i];
        }
        // Sort robots by position
        Arrays.sort(robotData, (a, b) -> Integer.compare(a[0], b[0]));
        // Sort walls for binary search
        Arrays.sort(walls);
        this.walls = walls;
        
        this.memo = new int[n][2];
        for (int[] row : memo) Arrays.fill(row, -1);

        // Start DFS from the last robot. Direction 'j' doesn't matter for the last one.
        return dfs(n - 1, 1);
    }

    private int dfs(int i, int j) {
        if (i < 0) return 0;
        if (memo[i][j] != -1) return memo[i][j];

        // Option 1: Robot i fires Left
        int leftRangeStart = robotData[i][0] - robotData[i][1];
        if (i > 0) {
            // Bullet stops at the robot to its left
            leftRangeStart = Math.max(leftRangeStart, robotData[i - 1][0] + 1);
        }
        int countLeft = countWallsInRange(leftRangeStart, robotData[i][0]);
        int resLeft = countLeft + dfs(i - 1, 0);

        // Option 2: Robot i fires Right
        int rightRangeEnd = robotData[i][0] + robotData[i][1];
        if (i + 1 < n) {
            // Bullet must stop before the robot to its right
            // If next robot (i+1) fires left, our right shot cannot overlap its range
            if (j == 0) {
                rightRangeEnd = Math.min(rightRangeEnd, robotData[i + 1][0] - robotData[i + 1][1] - 1);
            } else {
                rightRangeEnd = Math.min(rightRangeEnd, robotData[i + 1][0] - 1);
            }
        }
        int countRight = countWallsInRange(robotData[i][0], rightRangeEnd);
        int resRight = countRight + dfs(i - 1, 1);

        return memo[i][j] = Math.max(resLeft, resRight);
    }

    private int countWallsInRange(int start, int end) {
        if (start > end) return 0;
        int leftIdx = Arrays.binarySearch(walls, start);
        if (leftIdx < 0) leftIdx = -(leftIdx + 1);
        
        int rightIdx = Arrays.binarySearch(walls, end);
        if (rightIdx < 0) rightIdx = -(rightIdx + 1) - 1;
        
        return Math.max(0, rightIdx - leftIdx + 1);
    }
}
