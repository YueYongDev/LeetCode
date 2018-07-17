package t15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        Main main = new Main();
        List<List<Integer>> lists = main.threeSum(a);
        for (List<Integer> list : lists) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return lists;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int begin = i + 1;
            int end = nums.length - 1;
            while (begin < end) {
                int sum = nums[i] + nums[begin] + nums[end];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[begin]);
                    list.add(nums[end]);
                    lists.add(list);
                    begin++;
                    end--;
                    //避免重复
                    while (begin < end && nums[begin] == nums[begin - 1])
                        begin++;
                    while (begin < end && nums[end] == nums[end + 1])
                        end--;
                } else if (sum > 0)
                    end--;
                else begin++;
            }
        }
        return lists;
    }
}
