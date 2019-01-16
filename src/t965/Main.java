package t965;

/**
 * https://leetcode-cn.com/problems/univalued-binary-tree/
 */
public class Main {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(1);
        node.right = new TreeNode(1);
        node.right.right = new TreeNode(1);

        System.out.println(new Main().isUnivalTree(node));

    }

    public boolean isUnivalTree(TreeNode root) {

        if (root == null) return true;
        return traversal(root, root.val);

    }

    private boolean traversal(TreeNode node, int val) {
        if (node == null) return true;
        boolean res = node.val == val;
        boolean left = traversal(node.left, val);
        boolean right = traversal(node.right, val);
        return left && right && res;
    }
}
