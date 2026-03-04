class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return 0;

        int currentXor = 0;
        // Step 1: Calculate XOR for the first window of size k
        for (int i = 0; i < k; i++) {
            currentXor ^= arr[i];
        }

        int maxXor = currentXor;

        // Step 2: Slide the window across the array
        for (int i = k; i < n; i++) {
            // Remove the element leaving the window (arr[i-k])
            // Add the element entering the window (arr[i])
            currentXor = currentXor ^ arr[i - k] ^ arr[i];
            
            // Step 3: Update maximum
            maxXor = Math.max(maxXor, currentXor);
        }

        return maxXor;
    }
}
