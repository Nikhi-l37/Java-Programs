class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int max = 0;
        // 1. Find the maximum element to define the range
        for (int x : arr) {
            if (x > max) max = x;
        }

        // 2. Create a frequency array (hash table)
        int[] freq = new int[max + 1];
        for (int x : arr) {
            freq[x]++;
        }

        // 3. Iterate through all possible values of 'a' and 'b'
        for (int i = 1; i <= max; i++) {
            // Skip if 'a' is not in the array
            if (freq[i] == 0) continue;

            for (int j = 1; j <= max; j++) {
                // Skip if 'b' is not in the array
                // If a == b, we need at least two occurrences
                if (freq[j] == 0 || (i == j && freq[i] < 2)) continue;

                // 4. Calculate potential 'c'
                int a2 = i * i;
                int b2 = j * j;
                int c2 = a2 + b2;
                
                int c = (int) Math.sqrt(c2);

                // 5. Check if 'c' is a valid integer within the max range
                if (c * c == c2 && c <= max && freq[c] > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
