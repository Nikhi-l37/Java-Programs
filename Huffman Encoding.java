import java.util.*;

class Solution {
    class Node {
        int data;
        int minIndex; // smallest original leaf index in subtree
        Node left, right;
        Node(int data, int minIndex) {
            this.data = data;
            this.minIndex = minIndex;
            this.left = this.right = null;
        }
    }

    public ArrayList<String> huffmanCodes(String S, int f[]) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> {
            if (a.data != b.data) return Integer.compare(a.data, b.data);
            return Integer.compare(a.minIndex, b.minIndex);
        });

        for (int i = 0; i < f.length; i++) {
            pq.add(new Node(f[i], i));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(left.data + right.data, Math.min(left.minIndex, right.minIndex));
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }

        ArrayList<String> result = new ArrayList<>();
        if (!pq.isEmpty()) generateCodes(pq.poll(), "", result);
        return result;
    }

    private void generateCodes(Node root, String code, ArrayList<String> result) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            result.add(code.isEmpty() ? "0" : code);
            return;
        }
        generateCodes(root.left, code + "0", result);
        generateCodes(root.right, code + "1", result);
    }
}
