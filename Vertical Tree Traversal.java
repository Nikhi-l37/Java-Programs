import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store nodes at each horizontal distance (sorted by key)
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        // Queue for BFS: stores Pair of (Node, Horizontal Distance)
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;

            // Add current node's data to the map at its HD
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(node.data);

            // Left child has horizontal distance HD - 1
            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }
            // Right child has horizontal distance HD + 1
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }

        // Transfer sorted map values to the result list
        for (ArrayList<Integer> list : map.values()) {
            result.add(list);
        }

        return result;
    }

    // Helper class to store Node and its Horizontal Distance together
    class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
