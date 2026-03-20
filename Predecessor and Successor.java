class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node pre = null;
        Node suc = null;
        Node temp = root;

        // Find Successor
        while (temp != null) {
            if (temp.data > key) {
                suc = temp; // Potential successor
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        // Find Predecessor
        temp = root;
        while (temp != null) {
            if (temp.data < key) {
                pre = temp; // Potential predecessor
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }

        ArrayList<Node> result = new ArrayList<>();
        result.add(pre);
        result.add(suc);
        return result;
    }
}
