class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        // Fast pointer moves twice as fast as the slow pointer
        // If there's a cycle, they will eventually meet
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    // Helper method to calculate the sum of squares of digits
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}
