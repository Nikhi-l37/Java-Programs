import java.util.*;

class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 1: Precompute Catalan numbers up to n
        // Catalan sequence: 1, 1, 2, 5, 14, 42, ...
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        if (n > 0) catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }

        // Step 2: Sort the array to easily count elements smaller/larger than root
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Step 3: For each element in the original array, calculate possible BSTs
        for (int x : arr) {
            // Find position in sorted array to get counts of smaller/larger elements
            int pos = 0;
            for (int i = 0; i < n; i++) {
                if (sortedArr[i] == x) {
                    pos = i;
                    break;
                }
            }
            
            int leftCount = pos;            // elements < x
            int rightCount = n - 1 - pos;   // elements > x
            
            // Total BSTs = (BSTs from left elements) * (BSTs from right elements)
            result.add(catalan[leftCount] * catalan[rightCount]);
        }
        
        return result;
    }
}
