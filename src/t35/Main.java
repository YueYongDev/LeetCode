package t35;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(new Main().searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < target && nums[i] >= target) {
                return i;
            }
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        return 0;
    }
}
