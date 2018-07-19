package t404;


public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        Main main = new Main();
        System.out.println(main.sumOfLeftLeaves(treeNode));
    }

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null)
            return 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            sum += root.left.val;

        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return sum;
    }
}
