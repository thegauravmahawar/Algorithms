public class BinaryTreePostOrderTraversal {

    public static void main(String... args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        printPostOrder(root);
    }

    /**
     * Traverse the left subtree
     * Traverse the right subtree
     * Visit the root
     *
     * @param node
     */
    private static void printPostOrder(Node node) {
        if (node == null) return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data + " ");
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
