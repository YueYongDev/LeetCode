package t107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        addLevel(l, 0, root);
        Collections.reverse(l);
        return l;
    }

    public void addLevel(List<List<Integer>> list, int level, TreeNode node) {
        if (node == null) return;
        if (list.size() - 1 < level) list.add(new ArrayList<Integer>());
        list.get(level).add(node.val);

        addLevel(list, level + 1, node.left);
        addLevel(list, level + 1, node.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);

        Main main = new Main();
        List<List<Integer>> list = main.levelOrderBottom(t1);
        for (int i = 0; i < list.size(); i++) {
            for (Integer a : list.get(i)) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}
