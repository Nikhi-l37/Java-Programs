class Solution {
    public String largestSwap(String s) {
        char[] digits = s.toCharArray();
        int n = digits.length;
        
        // Store the last occurrence index of each digit 0-9
        int[] lastIdx = new int[10];
        for (int i = 0; i < n; i++) {
            lastIdx[digits[i] - '0'] = i;
        }
        
        // Traverse the string from left to right
        for (int i = 0; i < n; i++) {
            // Check if there is a larger digit available later in the string
            for (int d = 9; d > (digits[i] - '0'); d--) {
                if (lastIdx[d] > i) {
                    // Perform the swap
                    char temp = digits[i];
                    digits[i] = digits[lastIdx[d]];
                    digits[lastIdx[d]] = temp;
                    
                    return new String(digits);
                }
            }
        }
        
        // If no swap can make the string larger, return the original
        return s;
    }
}
