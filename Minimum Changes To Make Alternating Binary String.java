class Solution {
    public int minOperations(String s) {
        int count0 = 0; // operations needed to make it start with '0'
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // Expected character for pattern "0101..."
            char expected = (i % 2 == 0) ? '0' : '1';
            
            if (s.charAt(i) != expected) {
                count0++;
            }
        }
        
        // The operations for pattern "1010..." is (n - count0)
        return Math.min(count0, n - count0);
    }
}
