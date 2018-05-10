package t112;

public class Main {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(8);
        t1.left.left = new TreeNode(11);
        t1.right.left = new TreeNode(13);
        t1.right.right = new TreeNode(4);
        t1.left.left.left = new TreeNode(7);
        t1.left.left.right = new TreeNode(2);
        t1.right.right.right = new TreeNode(1);

//        TreeNode t2 = new TreeNode(1);

        Main main = new Main();
        System.out.println(main.hasPathSum(t1, 1));
    }

    boolean isOk = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        handle(root, 0, sum);
        return isOk;
    }


    public void handle(TreeNode node, int temp, int sum) {
        if (!isOk && node != null) {
            if (node.left == null && node.right == null && node.val + temp == sum) {
                isOk = true;
            }
            if (node.left != null) {
                handle(node.left, node.val + temp, sum);
            }
            if (node.right != null) {
                handle(node.right, node.val + temp, sum);
            }
        }
    }


}
