[78. 子集](https://leetcode-cn.com/problems/subsets/)


集合中每个元素的选和不选，构成了一个满二叉状态树，比如，左子树是不选，右子树是选，从根节点、到叶子节点的所有路径，构成了所有子集。可以有前序、中序、后序的不同写法，结果的顺序不一样。本质上，其实是比较完整的中序遍历。

![](https://pic.leetcode-cn.com/9e535eb558237c51a444a43a35304762aab0bf997f2c221b9a6004b6c647a046-%E5%B9%82%E9%9B%86%EF%BC%9A%E4%B8%AD%E5%BA%8F%E9%81%8D%E5%8E%86.png)

```text
public class Main {

    private List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        res.add(new ArrayList<>());
        ArrayList<Integer> subset = new ArrayList<>();
        inOrder(nums, 0, subset, res);
        return res;
    }

    public void inOrder(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> res) {
        if (i >= nums.length) return;
        subset = new ArrayList<>(subset);

        inOrder(nums, i + 1, subset, res);
        subset.add(nums[i]);
        // 这里
        res.add(subset);
        inOrder(nums, i + 1, subset, res);
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Main main = new Main();
        List<List<Integer>> result = main.subsets(nums);
        for (List<Integer> list : result) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
```