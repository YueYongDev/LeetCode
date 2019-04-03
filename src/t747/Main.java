package t747;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 0};
        System.out.println(main.dominantIndex(nums));
    }

public int dominantIndex(int[] nums) {
    if (nums.length == 1) return 0;
    // 先求出最大值和其下标
    int[] res = maxNumInArray(nums);
    Arrays.sort(nums);
    // 然后判断最大值是否适合第二大的值的2倍以上
    if (res[0] >= nums[nums.length - 2] * 2)
        return res[1];
    else return -1;
}

public int[] maxNumInArray(int[] nums) {
    // a[0]表示nums数组中的最大值，a[1]表示nums数组中最大值的下标
    int[] a = new int[]{Integer.MIN_VALUE, 0};
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > a[0]) {
            a[0] = nums[i];
            a[1] = i;
        }
    }
    return a;
}
}
