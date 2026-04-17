import java.util.HashSet;

class Solution {
    boolean canFormPalindrome(String s) {
        // We use a Set to track characters that appear an odd number of times
        HashSet<Character> oddChars = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (oddChars.contains(c)) {
                // If we see it again, it now has an even count
                oddChars.remove(c);
            } else {
                // If it's not in the set, it now has an odd count
                oddChars.add(c);
            }
        }
        
        // It's a palindrome if 0 or 1 characters have an odd frequency
        return oddChars.size() <= 1;
    }
}
