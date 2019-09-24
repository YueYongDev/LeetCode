package t39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        Main main = new Main();
        List<List<Integer>> lists = main.combinationSum(candidates, target);
        for (List<Integer> list : lists) {
            list.forEach(System.out::print);
            System.out.println();
        }


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, lists, 0, new ArrayList<>());
        return lists;

    }

    void helper(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> tempList) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(tempList));
        }
        for (int start = i; start < candidates.length; start++) {
            if (target < 0) {
                break;
            }
            tempList.add(candidates[start]);
            helper(candidates, target - candidates[start], res, start, tempList);
            tempList.remove(tempList.size() - 1);

        }
    }
}
