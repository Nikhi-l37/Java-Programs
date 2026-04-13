class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int currentDistance = Math.abs(i - start);
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                }
                // Optimization: if distance is 0, we can't do better
                if (minDistance == 0) return 0;
            }
        }
        
        return minDistance;
    }
}
