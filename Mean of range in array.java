import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        // Use long for prefix sums to avoid overflow if array values were larger, 
        // though with current constraints (10^5 * 10^3), int would technically suffice.
        long[] prefixSum = new long[n + 1];
        
        // Build the prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Process each query
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            
            // Sum of subarray from l to r
            long sum = prefixSum[r + 1] - prefixSum[l];
            
            // Number of elements in the range
            int count = r - l + 1;
            
            // Calculate floor of the mean using integer division
            result.add((int) (sum / count));
        }
        
        return result;
    }
}
