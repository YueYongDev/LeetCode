package t448;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        Main main = new Main();
        List<Integer> list = main.findDisappearedNumbers(nums);
        for (int x : list) {
            System.out.println(x);
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        for (int x : set) {
            list.add(x);
        }

        for (int i = list.size(); i < nums.length; i++) {
            list.add(0);
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.get(i) != i + 1) {
                res.add(i + 1);
                list.add(i, i);
            }
        }
        return res;
    }
}
