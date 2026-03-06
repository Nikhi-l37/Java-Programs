class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        int n = s1.length();
        StringBuilder s = new StringBuilder(s1);
        
        if(s1.length() != s2.length()) return false;
        
        if(s1.length() < 2) return s1.equals(s2);
        
      
        String clockwise = s1.substring(n-2) + s1.substring(0,n-2);
        String anticlockwise = s1.substring(2) + s1.substring(0,2);
        
        if(s2.equals(clockwise) || s2.equals(anticlockwise)){
            return true;
        }
        
        return false;
    }
}
