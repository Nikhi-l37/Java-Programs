class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                // Calculate distance moving forward
                int forwardDist = Math.abs(i - startIndex);
                
                // Calculate distance moving backward (circularly)
                int backwardDist = n - forwardDist;
                
                // Take the minimum of both directions, then update global minimum
                minDistance = Math.min(minDistance, Math.min(forwardDist, backwardDist));
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
