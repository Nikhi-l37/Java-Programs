import java.util.*;

class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int current : arr) {
            boolean currentDestroyed = false;

            // Process while there's a sign conflict with the top of the stack
            while (!stack.isEmpty() && (stack.peek() * current < 0)) {
                int top = stack.pop();
                int absTop = Math.abs(top);
                int absCurrent = Math.abs(current);

                if (absTop > absCurrent) {
                    // Top wins, put it back, current is gone
                    stack.push(top);
                    currentDestroyed = true;
                    break;
                } else if (absTop < absCurrent) {
                    // Current wins, top is already popped, continue to check next top
                    continue;
                } else {
                    // Both have equal absolute value, both are destroyed
                    currentDestroyed = true;
                    break;
                }
            }

            // If current survived all conflicts or had no conflicts
            if (!currentDestroyed) {
                stack.push(current);
            }
        }

        return new ArrayList<>(stack);
    }
}
