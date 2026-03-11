class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        
        int mask = 0;
        int temp = n;
        
        // Build a mask of all 1s with the same length as n
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        
        // XOR n with the mask to flip its bits
        return n ^ mask;
    }
}
