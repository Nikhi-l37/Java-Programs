import java.util.*;

public class Solution {
    public static int longestUniqueSubarrayWithSumK(int[] nums, int k) {
        int left = 0, right = 0;
        long currentSum = 0;
        int maxLen = 0;
        // Map to store frequency of elements in the current window
        Map<Integer, Integer> freqMap = new HashMap<>();

        while (right < nums.length) {
            // Add right element to window
            int rightVal = nums[right];
            freqMap.put(rightVal, freqMap.getOrDefault(rightVal, 0) + 1);
            currentSum += rightVal;

            // Shrink window if:
            // 1. Current element is not unique (frequency > 1)
            // 2. Sum exceeds k (assuming non-negative numbers)
            while (freqMap.get(rightVal) > 1 || (currentSum > k && left < right)) {
                int leftVal = nums[left];
                currentSum -= leftVal;
                freqMap.put(leftVal, freqMap.get(leftVal) - 1);
                if (freqMap.get(leftVal) == 0) freqMap.remove(leftVal);
                left++;
            }

            // If current window is valid and sum matches k
            if (currentSum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }
        return maxLen;
    }
}
