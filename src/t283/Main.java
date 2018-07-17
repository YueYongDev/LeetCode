package t283;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {0, 1, 0, 3, 12};
        main.moveZeroes(nums);
        for (int x : nums) {
            System.out.println(x);
        }
    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, index);
                index++;
            }
        }
    }

    public void swap(int[] nums, int i, int index) {
        int tmp = 0;
        tmp = nums[i];
        nums[i] = nums[index];
        nums[index] = tmp;
    }
}
