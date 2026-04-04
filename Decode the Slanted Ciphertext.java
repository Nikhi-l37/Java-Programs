class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;
        
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder sb = new StringBuilder();
        
        // Each diagonal starts at the first row (index 0 to cols-1)
        for (int i = 0; i < cols; i++) {
            // For a diagonal starting at (0, i), the next elements are (1, i+1), (2, i+2)...
            // The linear index in encodedText for (r, c) is: (r * cols) + c
            for (int r = 0, c = i; r < rows && c < cols; r++, c++) {
                sb.append(encodedText.charAt(r * cols + c));
            }
        }
        
        // Remove trailing spaces as per the problem note
        int last = sb.length() - 1;
        while (last >= 0 && sb.charAt(last) == ' ') {
            last--;
        }
        
        return sb.substring(0, last + 1);
    }
}
