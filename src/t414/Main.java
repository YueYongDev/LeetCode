package t414;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 1, 1};
        Main main = new Main();
        System.out.println(main.thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            set.add(nums[i]);
        }
        Object[] objects = set.toArray();
        Arrays.sort(objects);
        if (objects.length < 3) {
            return (int) objects[objects.length - 1];
        } else {
            return (int) objects[objects.length - 3];
        }
    }
}
