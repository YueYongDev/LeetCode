package t268;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        Main main = new Main();
        System.out.println(main.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 0)
                return 1;
            else
                return 0;
        }
        Arrays.sort(nums);
        if (nums[0] != 0)
            return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 2) {
                return nums[i] + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }
}
