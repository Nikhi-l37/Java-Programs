class Solution {
    public boolean checkOnesSegment(String s) {
        // Since there are no leading zeros, the first segment starts at index 0.
        // We only need to check if a '1' appears after any '0'.
        return !s.contains("01");
    }
}
