package t108;

public class Main {

    public TreeNode sortedArrayToBST(int[] nums) {
        int end = nums.length;
        if (end <= 0)
            return null;
        else
            return buildTree(nums, 0, end - 1);
    }

    public TreeNode buildTree(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = buildTree(nums, left, mid - 1);
            root.right = buildTree(nums, mid + 1, right);
            return root;
        } else
            return null;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {-10, -3, 0, 5, 9};
        TreeNode treeNode = main.sortedArrayToBST(a);
        main.printTreeNode(treeNode);
    }

    //打印二叉树（中序遍历）
    public void printTreeNode(TreeNode treeNode) {
        System.out.print(treeNode.val + " ");
        if (treeNode.left != null) {
            TreeNode left = treeNode.left;
            printTreeNode(left);
        }
        if (treeNode.right != null) {
            TreeNode right = treeNode.right;
            printTreeNode(right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}