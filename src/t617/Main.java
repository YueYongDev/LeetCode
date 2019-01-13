package t617;

/**
 * https://leetcode-cn.com/problems/merge-two-binary-trees/
 */

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(2);
        node1.left.left = new TreeNode(5);

        TreeNode node2 = new TreeNode(2);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(3);
        node2.left.right = new TreeNode(4);
        node2.right.right = new TreeNode(7);

        Main main = new Main();
        main.print(node1);
        System.out.println();
        main.print(node2);
        System.out.println();
        main.print(main.mergeTrees(node1, node2));
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 != null && t2 != null) {
            TreeNode node = new TreeNode(t1.val + t2.val);
            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
            return node;
        } else {
            return t1 == null ? t2 : t1;
        }
    }

    private void print(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            print(node.left);
            print(node.right);
        }
    }
}
