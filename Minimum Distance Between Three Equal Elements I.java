import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        // Map to store all indices for each unique number
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for (List<Integer> indices : map.values()) {
            // A good tuple needs at least 3 occurrences
            if (indices.size() >= 3) {
                found = true;
                // Check every window of 3 consecutive indices
                for (int i = 0; i <= indices.size() - 3; i++) {
                    int first = indices.get(i);
                    int last = indices.get(i + 2);
                    // Distance = 2 * (last - first)
                    minDistance = Math.min(minDistance, 2 * (last - first));
                }
            }
        }

        return found ? minDistance : -1;
    }
}
