package t41;

import java.util.Arrays;

/**
 * @author lyy
 */
public class Main {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        Arrays.sort(nums);
        int target = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                continue;
            } else if (nums[i] == target) {
                target++;
            } else {
                return target;
            }
        }
        return target;
    }
}
