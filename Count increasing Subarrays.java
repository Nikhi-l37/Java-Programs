class Solution {
    public int countIncreasing(int[] arr) {
        int n = arr.length;
        int count = 0;
        int len = 1; // Current length of increasing sequence

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                // Sequence continues
                len++;
            } else {
                // Sequence broke, add combinations from previous segment
                if (len >= 2) {
                    count += (len * (len - 1)) / 2;
                }
                len = 1; // Reset length
            }
        }

        // Add combinations from the final segment
        if (len >= 2) {
            count += (len * (len - 1)) / 2;
        }

        return count;
    }
}
