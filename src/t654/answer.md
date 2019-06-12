[654. 最大二叉树](https://leetcode-cn.com/problems/maximum-binary-tree/)

通过题目我们可以知道最大二叉树的根是这个数组中的最大值。
那么很明显首先我们要找出这个数组中的最大值，找到最大值之后就可以构建这棵树的根节点。
然后把最大值左边部分拿来构造一个最大二叉树当作此根节点的左子树。右子树同理。在构建左右最大子树时，就会意识到其实用递归可以解决这个问题。
递归的结束条件就是当只有一个节点时就直接返回，递归的前进条件就是还可以构建子树时就继续调用。整体思路大概就是这样，下面看代码：

```text
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
```