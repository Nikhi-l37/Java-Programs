class Solution {
    String URLify(String s) {
        // replaceAll uses regex; " " matches a literal space
        return s.replaceAll(" ", "%20");
    }
}
