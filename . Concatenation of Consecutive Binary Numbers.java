class Solution {
    public int concatenatedBinary(int n) {
        long MOD = 1_000_000_007;
        long result = 0;
        int bitLength = 0;

        for (int i = 1; i <= n; i++) {
            // If i is a power of 2, the number of bits increases by 1
            // Example: 2 (10), 4 (100), 8 (1000)
            if ((i & (i - 1)) == 0) {
                bitLength++;
            }

            // 1. Shift existing result to the left by bitLength
            // 2. Add the current number i
            // 3. Take modulo to keep the number within range
            result = ((result << bitLength) | i) % MOD;
        }

        return (int) result;
    }
}
