package t700;

/**
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 */
public class Main {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(2);
        node.right=new TreeNode(7);
        node.left.left=new TreeNode(1);
        node.left.right=new TreeNode(3);


    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null) return null;
        if (root.val==val) return root;
        else if (root.val>val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);
    }
}
