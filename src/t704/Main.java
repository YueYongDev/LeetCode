package t704;

/**
 * https://leetcode-cn.com/problems/binary-search/
 */
public class Main {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target)
                left = middle + 1;
            if (nums[middle] > target)
                right = middle - 1;
        }
        return -1;
    }
}
