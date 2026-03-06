class Solution {
    int maxValue(int arr[]) {
        // Step 1: Sort the array to maximize the sum of arr[i] * i
        Arrays.sort(arr);
        
        int n = arr.length;
        long sum = 0; // Use long to prevent intermediate overflow
        long mod = 1_000_000_007L; // Define the modulo constant
        
        for (int i = 0; i < n; i++) {
            // Step 2: Multiply and add using modulo
            // Cast to long to ensure multiplication doesn't overflow before modulo
            sum = (sum + (long)arr[i] * i) % mod;
        }
        
        return (int) sum; // Return final result as an int
    }
}
