import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int minDistance = Integer.MAX_VALUE;
        // Map value to its last two seen indices
        Map<Integer, int[]> lastIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (!lastIndices.containsKey(val)) {
                // Store [first_index, second_index]
                lastIndices.put(val, new int[]{i, -1});
            } else {
                int[] indices = lastIndices.get(val);
                if (indices[1] == -1) {
                    // Second occurrence found
                    indices[1] = i;
                } else {
                    // Third (or more) occurrence found
                    // Current i is 'k', indices[0] is 'i'
                    minDistance = Math.min(minDistance, 2 * (i - indices[0]));
                    
                    // Shift indices: the old second becomes the new first
                    indices[0] = indices[1];
                    indices[1] = i;
                }
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
