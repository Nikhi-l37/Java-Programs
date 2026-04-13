import java.util.*;

class Solution {
    static int[] nextPalindrome(int[] num) {
        int n = num.length;
        
        // Case 1: All 9s
        if (isAll9s(num)) {
            int[] res = new int[n + 1];
            res[0] = 1;
            res[n] = 1;
            return res;
        }

        // Case 2: General logic
        int mid = n / 2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;

        // Skip middle digits that are already equal
        while (i >= 0 && num[i] == num[j]) {
            i--;
            j++;
        }

        boolean leftIsSmaller = false;
        if (i < 0 || num[i] < num[j]) {
            leftIsSmaller = true;
        }

        // Copy left half to right half
        while (i >= 0) {
            num[j] = num[i];
            i--;
            j++;
        }

        // If left half was smaller, increment the middle and propagate carry
        if (leftIsSmaller) {
            int carry = 1;
            i = mid - 1;

            if (n % 2 == 1) {
                num[mid] += carry;
                carry = num[mid] / 10;
                num[mid] %= 10;
                j = mid + 1;
            } else {
                j = mid;
            }

            while (i >= 0) {
                num[i] += carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j++] = num[i--];
            }
        }
        return num;
    }

    private static boolean isAll9s(int[] num) {
        for (int x : num) if (x != 9) return false;
        return true;
    }
}
