class Solution {
    public int findPosition(int n) {
        // Step 1: Check if n has exactly one set bit.
        // A number with one set bit is a power of 2 (e.g., 1, 2, 4, 8...).
        // (n > 0) ensures it's not 0, and (n & (n - 1)) == 0 is a trick to check for powers of 2.
        if (n <= 0 || (n & (n - 1)) != 0) {
            return -1;
        }

        // Step 2: Find the position of that bit.
        // Since we know there is only one bit, we can count how many times 
        // we shift right until the number becomes 0.
        int position = 0;
        while (n > 0) {
            n = n >> 1;
            position++;
        }

        return position;
    }
}
