class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String doubled = s + s;
        
        // Target patterns
        StringBuilder target1 = new StringBuilder();
        StringBuilder target2 = new StringBuilder();
        for (int i = 0; i < doubled.length(); i++) {
            target1.append(i % 2 == 0 ? '0' : '1');
            target2.append(i % 2 == 0 ? '1' : '0');
        }
        
        int ans = Integer.MAX_VALUE;
        int diff1 = 0, diff2 = 0;
        
        for (int i = 0; i < doubled.length(); i++) {
            // Add current character to window diff
            if (doubled.charAt(i) != target1.charAt(i)) diff1++;
            if (doubled.charAt(i) != target2.charAt(i)) diff2++;
            
            // If window exceeds length n, remove the leftmost character
            if (i >= n) {
                if (doubled.charAt(i - n) != target1.charAt(i - n)) diff1--;
                if (doubled.charAt(i - n) != target2.charAt(i - n)) diff2--;
            }
            
            // Start updating answer once the window is full size n
            if (i >= n - 1) {
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }
        
        return ans;
    }
}
