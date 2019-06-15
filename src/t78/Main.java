package t78;

import java.util.ArrayList;
import java.util.List;


// 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
// 说明：解集不能包含重复的子集。

// 输入: nums = [1,2,3]
// 输出:[[3],[1],[2],[1,2,3],[1,3],[2,3],[1,2],[]]

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