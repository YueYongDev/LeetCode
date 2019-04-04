package t674;

/**
 * https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 */

public class Main {

    public static void main(String[] args) {

    }

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, j = 1;
        int max = 1;
        while (j < nums.length) {
            if (nums[j] <= nums[j - 1]) {
                if (j - i > max) max = j - i;
                i = j;
            }
            j++;
        }
        if (j == nums.length)
            max = Math.max(j - i, max);
        return max;
    }
}
