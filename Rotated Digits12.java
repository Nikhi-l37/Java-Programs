class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGood(int num) {
        boolean hasChangingDigit = false;
        while (num > 0) {
            int digit = num % 10;
            // If it contains 3, 4, or 7, it's invalid
            if (digit == 3 || digit == 4 || digit == 7) return false;
            
            // These digits change the value when rotated
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                hasChangingDigit = true;
            }
            num /= 10;
        }
        // Must contain at least one digit that actually changes (2, 5, 6, 9)
        return hasChangingDigit;
    }
}
