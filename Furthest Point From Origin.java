class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int underscores = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                countL++;
            } else if (c == 'R') {
                countR++;
            } else {
                underscores++;
            }
        }

        // The furthest distance is the absolute difference between L and R,
        // plus all the flexible underscore moves.
        return Math.abs(countL - countR) + underscores;
    }
}
