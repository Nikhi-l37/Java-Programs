class Solution {
    public int longestCycle(int V, int[][] edges) {
        // Convert edge list to an adjacency array for O(1) lookup
        // Since each node has at most one outgoing edge:
        int[] adj = new int[V];
        Arrays.fill(adj, -1);
        for (int[] edge : edges) {
            adj[edge[0]] = edge[1];
        }

        int maxCycle = -1;
        int[] visitedAt = new int[V]; // Stores the step count for the current path
        boolean[] globalVisited = new boolean[V]; // Stores if node was ever processed

        for (int i = 0; i < V; i++) {
            if (globalVisited[i]) continue;

            int curr = i;
            int step = 1;
            Map<Integer, Integer> currentPath = new HashMap<>();

            while (curr != -1 && !globalVisited[curr]) {
                globalVisited[curr] = true;
                currentPath.put(curr, step);
                
                int next = adj[curr];
                if (next != -1 && currentPath.containsKey(next)) {
                    // Cycle detected!
                    maxCycle = Math.max(maxCycle, step - currentPath.get(next) + 1);
                }
                
                curr = next;
                step++;
            }
        }

        return maxCycle;
    }
}
