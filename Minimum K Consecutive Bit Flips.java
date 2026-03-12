class Solution {
    public int kBitFlips(int[] arr, int k) {
        int n = arr.length;
        int flips = 0; // Total operations performed
        int currentFlips = 0; // Flips currently affecting the current index
        int[] diff = new int[n + 1]; // Difference array to track flip boundaries

        for (int i = 0; i < n; i++) {
            currentFlips += diff[i];

            // If (arr[i] + currentFlips) is even, the current bit is 0
            if ((arr[i] + currentFlips) % 2 == 0) {
                // If there's no room for a subarray of length k, it's impossible
                if (i + k > n) {
                    return -1;
                }

                // Apply flip
                flips++;
                currentFlips++;
                diff[i + k]--; // The flip effect ends after index i + k - 1
            }
        }

        return flips;
    }
}
