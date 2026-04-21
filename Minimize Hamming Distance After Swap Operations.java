import java.util.*;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        UnionFind uf = new UnionFind(n);
        
        // Step 1: Group all indices that can be swapped with each other
        for (int[] swap : allowedSwaps) {
            uf.union(swap[0], swap[1]);
        }
        
        // Step 2: Map each group root to the elements present in source at those indices
        Map<Integer, Map<Integer, Integer>> components = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = uf.find(i);
            components.putIfAbsent(root, new HashMap<>());
            components.get(root).put(source[i], components.get(root).getOrDefault(source[i], 0) + 1);
        }
        
        // Step 3: Compare target elements against the available elements in each group
        int distance = 0;
        for (int i = 0; i < n; i++) {
            int root = uf.find(i);
            Map<Integer, Integer> counts = components.get(root);
            
            if (counts.getOrDefault(target[i], 0) > 0) {
                // Element exists in this component, "use" it and don't count towards distance
                counts.put(target[i], counts.get(target[i]) - 1);
            } else {
                // Element not available in this component's source pool
                distance++;
            }
        }
        
        return distance;
    }
    
    // Standard Union-Find Helper Class
    class UnionFind {
        int[] parent;
        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        
        public int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]); // Path compression
        }
        
        public void union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI != rootJ) parent[rootI] = rootJ;
        }
    }
}
