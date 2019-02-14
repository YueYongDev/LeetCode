package t561;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {
        int a = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            a = a + nums[i];
        }
        return a;
    }
}
