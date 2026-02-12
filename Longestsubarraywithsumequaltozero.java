import java.util.*;

public class Solution {
    public static int longestUniqueSubarrayZeroSum(int[] arr) {
        int left = 0, right = 0;
        int currentSum = 0;
        int maxLen = 0;
        // Set to track unique elements in the current window
        Set<Integer> windowSet = new HashSet<>();

        while (right < arr.length) {
            // If the element is already in the window, shrink from the left
            // until the duplicate of arr[right] is removed.
            while (windowSet.contains(arr[right])) {
                currentSum -= arr[left];
                windowSet.remove(arr[left]);
                left++;
            }

            // Add the current element
            windowSet.add(arr[right]);
            currentSum += arr[right];

            // Check if the current unique window sums to 0
            if (currentSum == 0) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }
        return maxLen;
    }
}
