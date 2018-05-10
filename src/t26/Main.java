package t26;

public class Main {

    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {1, 1, 2};
        int len=removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length - 1;
        for (int i = len; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                len--;
            }
        }
        return len + 1;
    }
}
