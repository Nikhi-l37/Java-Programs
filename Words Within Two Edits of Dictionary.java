import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        
        for (String query : queries) {
            if (canMatch(query, dictionary)) {
                result.add(query);
            }
        }
        
        return result;
    }
    
    private boolean canMatch(String query, String[] dictionary) {
        int n = query.length();
        
        for (String word : dictionary) {
            int edits = 0;
            for (int i = 0; i < n; i++) {
                if (query.charAt(i) != word.charAt(i)) {
                    edits++;
                }
                // Optimization: stop if we exceed 2 edits
                if (edits > 2) break;
            }
            
            // If we found a word within 2 edits, this query is valid
            if (edits <= 2) {
                return true;
            }
        }
        
        return false;
    }
}
