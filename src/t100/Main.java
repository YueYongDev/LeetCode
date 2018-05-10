package t100;

public class Main {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
//        t1.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
//        t2.right = new TreeNode(2);

        System.out.println(new Main().isSameTree(t1, t2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else {
            if (p == null || q == null) {
                return false;
            }
            return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
    }
}
