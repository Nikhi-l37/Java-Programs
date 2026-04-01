class Solution {
    long countStrings(int n) {
        long mod = 1_000_000_007;
        
        // a = strings ending in 0, b = strings ending in 1
        long a = 1; // case n=1: "0"
        long b = 1; // case n=1: "1"
        
        for (int i = 2; i <= n; i++) {
            long temp = (a + b) % mod;
            b = a;    // New strings ending in 1 must have ended in 0
            a = temp; // New strings ending in 0 can come from both
        }
        
        return (a + b) % mod;
    }
}
