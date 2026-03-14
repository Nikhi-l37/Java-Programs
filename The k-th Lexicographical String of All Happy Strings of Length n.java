class Solution {
    public String getHappyString(int n, int k) {
        int total = 3 * (int) Math.pow(2, n - 1);
        if (k > total) return "";

        StringBuilder sb = new StringBuilder();
        char[] chars = {'a', 'b', 'c'};
        
        // Adjust k to 0-indexed for easier math
        k--; 

        // 1. Determine the first character
        int partitionSize = (int) Math.pow(2, n - 1);
        int index = k / partitionSize;
        sb.append(chars[index]);
        k %= partitionSize;

        // 2. Determine the remaining n-1 characters
        for (int i = 1; i < n; i++) {
            partitionSize /= 2;
            char lastChar = sb.charAt(sb.length() - 1);
            
            // Get the two available characters (sorted)
            char c1 = (lastChar == 'a') ? 'b' : 'a';
            char c2 = (lastChar == 'c') ? 'b' : 'c';
            if (c1 > c2) { char temp = c1; c1 = c2; c2 = temp; }

            // Pick based on remaining k
            if (k < partitionSize) {
                sb.append(c1);
            } else {
                sb.append(c2);
                k -= partitionSize;
            }
        }

        return sb.toString();
    }
}
