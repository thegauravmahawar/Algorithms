public class BinaryTreePreOrderTraversal {

    public static void main(String... args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        printPreOrder(root);
    }

    /**
     * Visit the root
     * Traverse the left subtree
     * Traverse the right subtree
     *
     * @param node
     */
    private static void printPreOrder(Node node) {
        if (node == null) return;

        System.out.println(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    private static class Node {
        private Node left;
        private Node right;

        private int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
