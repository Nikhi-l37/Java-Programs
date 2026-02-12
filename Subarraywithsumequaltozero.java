import java.util.HashMap;

public class Solution {
    public static int longestSubarrayZeroSum(int[] arr) {
        // Map to store (prefixSum, firstOccurringIndex)
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // Case 1: Subarray from index 0 has sum 0
            if (currentSum == 0) {
                maxLen = i + 1;
            }

            // Case 2: Current prefix sum seen before
            if (map.containsKey(currentSum)) {
                // Max length = current index - previous seen index
                maxLen = Math.max(maxLen, i - map.get(currentSum));
            } else {
                // Store only the FIRST occurrence for maximum length
                map.put(currentSum, i);
            }
        }
        return maxLen;
    }
}
