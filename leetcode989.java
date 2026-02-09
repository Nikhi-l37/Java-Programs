import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // Use LinkedList for O(1) insertions at the beginning (index 0)
        LinkedList<Integer> res = new LinkedList<>();
        int i = num.length - 1;

        // Loop while there are digits in 'num' or a carry left in 'k'
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i--]; // Add array digit to k and move pointer
            }
            res.addFirst(k % 10); // Extract last digit and prepend to result
            k /= 10;               // Update k to be the carry
        }

        return res;
    }
}
