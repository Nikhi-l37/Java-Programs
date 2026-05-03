import java.util.*;

class Solution {
    // Changed return type from void to ArrayList<Integer>
    public ArrayList<Integer> sortBySetBitCount(int[] arr) {
        int n = arr.length;
        
        // Use a boxed Integer array to utilize custom sorting
        Integer[] temp = new Integer[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // TimSort (used by Arrays.sort on objects) is stable, 
        // satisfying the problem's requirement for same-bit-count elements.
        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            
            // Descending order: b - a
            return Integer.compare(countB, countA);
        });

        // Convert the sorted array into an ArrayList as requested by the driver code
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : temp) {
            result.add(val);
        }
        
        return result;
    }
}
