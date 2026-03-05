import java.util.HashMap;

class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int maxLen = -1;
        int left = 0;
        // Map to store the frequency of characters in the current window
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char rChar = s.charAt(right);
            map.put(rChar, map.getOrDefault(rChar, 0) + 1);

            // If we have more than k distinct characters, shrink the window from the left
            while (map.size() > k) {
                char lChar = s.charAt(left);
                map.put(lChar, map.get(lChar) - 1);
                if (map.get(lChar) == 0) {
                    map.remove(lChar);
                }
                left++;
            }

            // If the window has exactly k distinct characters, update maxLen
            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
