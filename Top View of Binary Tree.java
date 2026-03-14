import java.util.*;

class Solution {
    // Helper class to store node and its horizontal distance
    class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store the first node at each horizontal distance
        // TreeMap keeps keys sorted (leftmost to rightmost)
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int hd = curr.hd;
            Node temp = curr.node;

            // If this distance hasn't been seen, it's the topmost node
            if (!map.containsKey(hd)) {
                map.put(hd, temp.data);
            }

            if (temp.left != null) {
                queue.add(new Pair(temp.left, hd - 1));
            }
            if (temp.right != null) {
                queue.add(new Pair(temp.right, hd + 1));
            }
        }

        // Extract values from the sorted map
        for (int val : map.values()) {
            result.add(val);
        }

        return result;
    }
}
