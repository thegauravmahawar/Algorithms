/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree">Maximum Depth of Binary Tree</a>
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String... args) {
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        node1.right.left = new TreeNode(15);
        node1.right.right = new TreeNode(7);
        System.out.println(maxDepth(node1));
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        if (leftHeight > rightHeight) return leftHeight + 1;
        else return rightHeight + 1;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
