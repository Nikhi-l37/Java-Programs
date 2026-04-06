import java.util.HashSet;
import java.util.Set;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Directions: North, East, South, West
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0, d = 0; // Start at origin facing North (index 0)
        int maxDistSq = 0;

        // Store obstacles as strings "x,y" for fast lookup
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }

        for (int cmd : commands) {
            if (cmd == -1) { // Turn right
                d = (d + 1) % 4;
            } else if (cmd == -2) { // Turn left
                d = (d + 3) % 4;
            } else { // Move forward k units
                for (int i = 0; i < cmd; i++) {
                    int nextX = x + dirs[d][0];
                    int nextY = y + dirs[d][1];
                    
                    // Check if next step is an obstacle
                    if (!obstacleSet.contains(nextX + "," + nextY)) {
                        x = nextX;
                        y = nextY;
                        maxDistSq = Math.max(maxDistSq, x * x + y * y);
                    } else {
                        // Hit obstacle, stop moving for this command
                        break;
                    }
                }
            }
        }

        return maxDistSq;
    }
}
