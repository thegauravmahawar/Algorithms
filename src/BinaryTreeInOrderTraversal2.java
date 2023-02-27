import java.util.ArrayList;
import java.util.List;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">Binary Tree Inorder Traversal</a>
 */
public class BinaryTreeInOrderTraversal2 {

    public static class TreeNode {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        collectInOrder(root, list);
        return list;
    }

    private void collectInOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        collectInOrder(node.left, list);
        list.add(node.val);
        collectInOrder(node.right, list);
    }
}
