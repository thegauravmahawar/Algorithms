public class BinaryTreeInOrderTraversal {

    public static void main(String... args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        printInOrder(root);
    }

    /**
     * Traverse the left subtree
     * Visit the root
     * Traverse the right subtree
     *
     * @param node
     */
    private static void printInOrder(Node node) {
        if (node == null) return;

        printInOrder(node.left);
        System.out.println(node.data + " ");
        printInOrder(node.right);
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
