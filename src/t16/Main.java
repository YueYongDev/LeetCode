package t16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int target = -100;
        int[] nums = {1, 1, 1, 0};
        Main main = new Main();
        System.out.println(main.threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3)
            return 0;
        int min = 10000;
        Arrays.sort(nums);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int minus = sum - target;
                    if (Math.abs(minus) < min) {
                        min = Math.abs(minus);
                        a = i;
                        b = j;
                        c = k;
                    }
                }
            }
        }
        return nums[a] + nums[b] + nums[c];
    }
}
