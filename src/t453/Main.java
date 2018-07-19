package t453;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += (nums[i] - nums[0]);
        }
        return sum;
    }
}
