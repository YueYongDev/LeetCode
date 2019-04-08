package t724;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/find-pivot-index/
 */

public class Main {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int[] left = Arrays.copyOfRange(nums, 0, i);
            int[] right = Arrays.copyOfRange(nums, i + 1, nums.length);
            int leftSum = sumOfArray(left);
            int rightSum = sumOfArray(right);
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    private int sumOfArray(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }
}
