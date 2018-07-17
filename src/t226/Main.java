package t226;

public class Main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(9);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode treeNode = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = treeNode;
        return root;
    }
}
