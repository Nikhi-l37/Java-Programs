class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < nums.length; i++) {
            // Get the i-th character of the i-th string
            char currentChar = nums[i].charAt(i);
            
            // Flip it: if '0' -> '1', if '1' -> '0'
            sb.append(currentChar == '0' ? '1' : '0');
        }
        
        return sb.toString();
    }
}
