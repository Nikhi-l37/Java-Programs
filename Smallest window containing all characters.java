class Solution {
    public static String minWindow(String s, String p) {
        if (s == null || p == null || s.length() < p.length()) return "";

        int[] pMap = new int[256];
        for (char c : p.toCharArray()) pMap[c]++;

        int start = 0, minStart = -1, minLen = Integer.MAX_VALUE;
        int count = 0; // Number of characters of p currently in the window
        int[] sMap = new int[256];

        for (int end = 0; end < s.length(); end++) {
            char charEnd = s.charAt(end);
            sMap[charEnd]++;

            // If current char is part of p and we haven't exceeded its required count
            if (pMap[charEnd] != 0 && sMap[charEnd] <= pMap[charEnd]) {
                count++;
            }

            // When window is valid, try to shrink it
            while (count == p.length()) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char charStart = s.charAt(start);
                sMap[charStart]--;
                
                // If removing this char makes the window invalid
                if (pMap[charStart] != 0 && sMap[charStart] < pMap[charStart]) {
                    count--;
                }
                start++;
            }
        }

        return minStart == -1 ? "" : s.substring(minStart, minStart + minLen);
    }
}
