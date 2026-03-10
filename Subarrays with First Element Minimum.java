import java.util.Stack;

class Solution {
    public int countSubarrays(int[] arr) {
        int n = arr.length;
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Find the index of the next strictly smaller element for each position
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                nextSmaller[i] = n; // No smaller element found, extends to end
            } else {
                nextSmaller[i] = stack.peek();
            }
            stack.push(i);
        }

        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            // Number of valid subarrays starting at i is (index of next smaller - i)
            totalCount += (nextSmaller[i] - i);
        }

        return totalCount;
    }
}
