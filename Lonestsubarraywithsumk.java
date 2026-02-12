import java.util.HashMap;

public class Solution {
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        long currentSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // Case 1: Subarray starting from index 0
            if (currentSum == k) {
                maxLen = i + 1;
            }

            // Case 2: Subarray found using prefix sum
            if (map.containsKey(currentSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(currentSum - k));
            }

            // Case 3: Only store the first occurrence of currentSum
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }
        return maxLen;
    }
}

