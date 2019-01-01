package t865;

public class Main {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(3);
        node.left=new TreeNode(5);
        node.left.left=new TreeNode(6);
        node.left.right=new TreeNode(2);
        node.left.right.left=new TreeNode(7);
        node.left.right.right=new TreeNode(4);
        node.right=new TreeNode(1);
        node.right.left=new TreeNode(0);
        node.right.right=new TreeNode(8);

        System.out.println(new Main().subtreeWithAllDeepest(node).val);
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root==null) return root;
        int left=depth(root.left);
        int right=depth(root.right);
        if (left==right) return root;
        if (left>right) return subtreeWithAllDeepest(root.left);
        else return subtreeWithAllDeepest(root.right);
    }

    private int depth(TreeNode node){
        if (node==null) return 0;
        return Math.max(depth(node.left),depth(node.right))+1;
    }
}
