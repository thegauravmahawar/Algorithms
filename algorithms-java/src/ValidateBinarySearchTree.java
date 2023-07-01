/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/validate-binary-search-tree/">Validate Binary Search Tree</a>
 */
public class ValidateBinarySearchTree {

    public static void main(String... args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);
        System.out.println(isValidBST(root1));
    }

    private static boolean isValidBST(Node root) {
        return validate(root, null, null);
    }

    private static boolean validate(Node root, Integer low, Integer high) {
        if (root == null) return true;
        if (low != null && root.val <= low) return false;
        if (high != null && root.val >= high) return false;

        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

    private static class Node {
        private Node left;
        private Node right;

        private int val;

        public Node(int data) {
            this.val = data;
        }
    }
}
