package t628;

/**
 * https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int x1 = nums[0] * nums[1] * nums[len-1];
        int x2 = nums[len-3] * nums[len - 1] * nums[len - 2];
        if (x1 >= x2) return x1;
        else return x2;
    }
}
