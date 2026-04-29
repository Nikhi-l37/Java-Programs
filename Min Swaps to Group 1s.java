class Solution {
    public int minSwaps(int[] arr) {
        int n = arr.length;
        int totalOnes = 0;

        // Step 1: Count total number of 1s
        for (int num : arr) {
            if (num == 1) totalOnes++;
        }

        // Handle the case where there are no 1s
        if (totalOnes == 0) return -1;

        // Step 2: Initialize the first window of size totalOnes
        int currentZeros = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (arr[i] == 0) currentZeros++;
        }

        int minSwaps = currentZeros;

        // Step 3: Slide the window across the array
        for (int i = totalOnes; i < n; i++) {
            // Add the new element entering the window
            if (arr[i] == 0) currentZeros++;
            
            // Remove the element leaving the window
            if (arr[i - totalOnes] == 0) currentZeros--;

            // Update the minimum swaps found so far
            minSwaps = Math.min(minSwaps, currentZeros);
        }

        return minSwaps;
    }
}
