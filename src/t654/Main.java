package t654;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode node = main.constructMaximumBinaryTree(nums);
        main.print(node);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = buildTree(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode buildTree(int[] nums, int start, int end) {
        int index = start;

        //找出最大元素的下标
        for (int i = start; i <= end; i++) {
            if (nums[index] < nums[i]) {
                index = i;
            }
        }
        TreeNode tree = new TreeNode(nums[index]);

        if (index > start) {
            tree.left = buildTree(nums, start, index - 1);
        }
        if (index < end) {
            tree.right = buildTree(nums, index + 1, end);
        }

        return tree;
    }


    private void print(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            print(node.left);
            print(node.right);
        }
    }
}


