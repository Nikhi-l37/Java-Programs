class Solution {
    public int longestSubstr(String s, int k) {
        int n = s.length();
        // The array needs a fixed size of 26 for 'A' through 'Z'
        int[] count = new int[26]; 
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            // Increment frequency of the current character
            int charIndex = s.charAt(right) - 'A';
            count[charIndex]++;
            
            // maxFreq tracks the count of the most frequent character in the current window
            maxFreq = Math.max(maxFreq, count[charIndex]);

            // If the number of characters to replace (window size - maxFreq) exceeds k
            // we shrink the window from the left.
            if ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // The largest valid window found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
