class Solution {
    private Integer[][][] memo;
    
    public int minimumDistance(String word) {
        // memo[index][finger1_pos][finger2_pos]
        // Using 26 for 'no position yet' (free start)
        memo = new Integer[word.length()][27][27];
        return dp(word, 0, 26, 26);
    }
    
    private int dp(String word, int idx, int f1, int f2) {
        if (idx == word.length()) return 0;
        if (memo[idx][f1][f2] != null) return memo[idx][f1][f2];
        
        int target = word.charAt(idx) - 'A';
        
        // Option 1: Move finger 1 to target
        int moveF1 = getDist(f1, target) + dp(word, idx + 1, target, f2);
        
        // Option 2: Move finger 2 to target
        int moveF2 = getDist(f2, target) + dp(word, idx + 1, f1, target);
        
        return memo[idx][f1][f2] = Math.min(moveF1, moveF2);
    }
    
    private int getDist(int from, int to) {
        if (from == 26) return 0; // Initial position is free
        int x1 = from / 6, y1 = from % 6;
        int x2 = to / 6, y2 = to % 6;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
