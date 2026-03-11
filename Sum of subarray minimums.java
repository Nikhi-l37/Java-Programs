import java.util.Stack;

class Solution {
    public int sumSubMins(int[] arr) {
        int n = arr.length;
        long totalSum = 0;
        int[] left = new int[n];  // Distance to nearest smaller element on left
        int[] right = new int[n]; // Distance to nearest smaller element on right
        Stack<Integer> stack = new Stack<>();

        // Find nearest smaller to the left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Find nearest smaller to the right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Calculate contribution of each element
        for (int i = 0; i < n; i++) {
            totalSum += (long) arr[i] * left[i] * right[i];
        }

        return (int) totalSum;
    }
}
