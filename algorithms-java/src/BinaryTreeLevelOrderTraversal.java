public class BinaryTreeLevelOrderTraversal {

    public static void main(String... args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        printLevelOrder(root);
    }

    private static void printLevelOrder(Node node) {
        int h = height(node);
        for (int i = 1; i <= h; i++) {
            printCurrentLevel(node, i);
        }
    }

    private static void printCurrentLevel(Node node, int level) {
        if (node == null) return;

        if (level == 1) {
            System.out.println(node.data + " ");
        } else {
            printCurrentLevel(node.left, level - 1);
            printCurrentLevel(node.right, level - 1);
        }
    }

    private static int height(Node node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (leftHeight > rightHeight) return leftHeight + 1;
        else return rightHeight + 1;
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
