class Solution {
    public boolean isSubTree(Node root1, Node root2) {
        // Base case: If root2 is null, it's technically a subtree of anything
        if (root2 == null) return true;
        
        // If the main tree is null but root2 isn't, root2 cannot be a subtree
        if (root1 == null) return false;

        // 1. If the current nodes match, check if the trees are identical
        if (isIdentical(root1, root2)) return true;

        // 2. Otherwise, check the left and right children of root1
        return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
    }

    // Helper function to check if two trees are identical
    private boolean isIdentical(Node r1, Node r2) {
        // Both null = identical
        if (r1 == null && r2 == null) return true;
        
        // One null or values differ = not identical
        if (r1 == null || r2 == null || r1.data != r2.data) return false;

        // Recursively check left and right branches
        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }
}
