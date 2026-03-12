import java.util.*;

class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        // Collect all mandatory edges to check for immediate invalidity
        int mandatoryCount = 0;
        DSU checkDSU = new DSU(n);
        for (int[] e : edges) {
            if (e[3] == 1) {
                if (!checkDSU.union(e[0], e[1])) return -1; // Cycle in mandatory edges
                mandatoryCount++;
            }
        }
        if (mandatoryCount > n - 1) return -1;

        // Binary search on potential strengths
        TreeSet<Integer> possible = new TreeSet<>();
        for (int[] e : edges) {
            possible.add(e[2]);
            if (e[3] == 0) possible.add(e[2] * 2);
        }

        List<Integer> sorted = new ArrayList<>(possible);
        int low = 0, high = sorted.size() - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFormMST(n, edges, k, sorted.get(mid))) {
                ans = sorted.get(mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean canFormMST(int n, int[][] edges, int k, int threshold) {
        DSU dsu = new DSU(n);
        int edgesUsed = 0;
        int upgradesUsed = 0;

        // 1. Mandatory edges MUST be >= threshold
        for (int[] e : edges) {
            if (e[3] == 1) {
                if (e[2] < threshold) return false; 
                dsu.union(e[0], e[1]);
                edgesUsed++;
            }
        }

        // 2. Add optional edges that meet threshold without upgrade
        for (int[] e : edges) {
            if (e[3] == 0 && e[2] >= threshold) {
                if (dsu.union(e[0], e[1])) edgesUsed++;
            }
        }

        // 3. Add optional edges that meet threshold WITH upgrade
        for (int[] e : edges) {
            if (e[3] == 0 && e[2] < threshold && e[2] * 2 >= threshold) {
                if (upgradesUsed < k && dsu.union(e[0], e[1])) {
                    upgradesUsed++;
                    edgesUsed++;
                }
            }
        }

        return edgesUsed == n - 1;
    }

    class DSU {
        int[] parent;
        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }
        boolean union(int i, int j) {
            int rootI = find(i), rootJ = find(j);
            if (rootI != rootJ) {
                parent[rootI] = rootJ;
                return true;
            }
            return false;
        }
    }
}
