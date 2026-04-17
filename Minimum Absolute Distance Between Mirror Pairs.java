import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        // Map to store: reverse(nums[i]) -> latest index i
        Map<Integer, Integer> lastSeen = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for (int j = 0; j < nums.length; j++) {
            int currentVal = nums[j];

            // Check if current nums[j] was the target of any previous reverse(nums[i])
            if (lastSeen.containsKey(currentVal)) {
                int i = lastSeen.get(currentVal);
                minDistance = Math.min(minDistance, j - i);
                found = true;
            }

            // Store the reverse of current number for future pairs
            // Note: If multiple indices have the same reverse, we only care about 
            // the closest one (the largest index), so we overwrite.
            lastSeen.put(reverse(currentVal), j);
        }

        return found ? minDistance : -1;
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
