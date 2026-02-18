void printInorder(Node node) {
    if (node == null) return;

    printInorder(node.left);      // Traverse left
    System.out.print(node.key + " "); // Visit root
    printInorder(node.right);     // Traverse right
}

