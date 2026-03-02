import java.util.*;

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Use a HashMap to store the count of each element
        Map<Integer, Integer> counts = new HashMap<>();

        // Step 1: Count occurrences of each number
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Step 2: Iterate through the array to find the first element 
        // that appears more than once in the map
        for (int i = 0; i < arr.length; i++) {
            if (counts.get(arr[i]) > 1) {
                // Return 1-based index
                return i + 1;
            }
        }

        // If no repeating element is found
        return -1;
    }
}
