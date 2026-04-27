class Solution {
    public int smallestSubstring(String s) {
        int last0 = -1;
        int last1 = -1;
        int last2 = -1;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Update the last seen index for the current character
            if (c == '0') last0 = i;
            else if (c == '1') last1 = i;
            else if (c == '2') last2 = i;

            // If we have seen all three characters at least once
            if (last0 != -1 && last1 != -1 && last2 != -1) {
                // The substring ends at i and starts at the minimum of the three indices
                int start = Math.min(last0, Math.min(last1, last2));
                int currentLen = i - start + 1;
                minLength = Math.min(minLength, currentLen);
            }
        }

        // If minLength was never updated, it means no valid substring exists
        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}
