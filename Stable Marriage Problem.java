import java.util.*;

class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        int n = men.length;
        
        // rank[w][m] stores how much woman w likes man m (lower is better)
        int[][] rank = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rank[i][women[i][j]] = j;
            }
        }

        int[] manToWoman = new int[n]; // Result: manToWoman[m] = w
        int[] womanToMan = new int[n]; // womanToMan[w] = m
        Arrays.fill(manToWoman, -1);
        Arrays.fill(womanToMan, -1);

        // Track which woman each man should propose to next
        int[] nextProposeIndex = new int[n];
        
        Queue<Integer> freeMen = new LinkedList<>();
        for (int i = 0; i < n; i++) freeMen.add(i);

        while (!freeMen.isEmpty()) {
            int m = freeMen.poll();
            int w = men[m][nextProposeIndex[m]++];

            if (womanToMan[w] == -1) {
                // Woman is free, they get engaged
                womanToMan[w] = m;
                manToWoman[m] = w;
            } else {
                int currentM = womanToMan[w];
                // Check if woman w prefers new man m over current partner currentM
                if (rank[w][m] < rank[w][currentM]) {
                    // She dumps currentM
                    manToWoman[currentM] = -1;
                    freeMen.add(currentM);
                    
                    // She gets engaged to m
                    womanToMan[w] = m;
                    manToWoman[m] = w;
                } else {
                    // She rejects m, he stays free to try his next choice
                    freeMen.add(m);
                }
            }
        }

        return manToWoman;
    }
}
