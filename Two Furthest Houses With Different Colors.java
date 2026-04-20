class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int left = 0;
        int right = n - 1;
        
        // Scenario 1: Find the furthest house from the left that is different from colors[0]
        while (colors[right] == colors[0]) {
            right--;
        }
        int dist1 = right; // distance is right - 0
        
        // Scenario 2: Find the furthest house from the right that is different from colors[n-1]
        while (colors[left] == colors[n - 1]) {
            left++;
        }
        int dist2 = (n - 1) - left;
        
        return Math.max(dist1, dist2);
    }
}
