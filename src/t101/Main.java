package t101;

public class Main {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);

//        TreeNode t2 = new TreeNode(1);
//        t2.left = new TreeNode(2);
//        t2.right = new TreeNode(2);
        System.out.println(new Main().isSymmetric(t1));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null)
            return true;
        else if (left != null && right == null || left == null && right != null)
            return false;
        else
            return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
