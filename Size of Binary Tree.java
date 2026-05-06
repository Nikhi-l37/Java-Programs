class Solution {
    public int getSize(Node root) {
        // Base case: if the tree is empty, the size is 0
        if (root == null) {
            return 0;
        }

        // Recursive step: 1 (current node) + size of left subtree + size of right subtree
        return 1 + getSize(root.left) + getSize(root.right);
    }
}
