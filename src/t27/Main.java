package t27;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
        int len = new Main().removeElement(nums, val);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.print((nums[i] + " "));
        }
    }

    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] != val) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                len = i;
                break;
            }
        }
        return len;
    }
}
