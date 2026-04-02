class Solution {
    int countWays(int n, int k) {
        if (n == 0) return 0;
        if (n == 1) return k;
        
        // Using long to prevent overflow during intermediate calculations
        long same = k;           // Ways for n=2 where last two are same
        long diff = (long) k * (k - 1); // Ways for n=2 where last two are different
        long total = same + diff;

        for (int i = 3; i <= n; i++) {
            same = diff;
            diff = total * (k - 1);
            total = same + diff;
        }

        return (int) total;
    }
}
