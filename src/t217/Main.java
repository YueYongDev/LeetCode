package t217;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int nums[] = {1, 2, 3, 4};
        System.out.println(main.containsDuplicate(nums));
    }

//    第一种方式用HashMap实现，但是会超时
//    public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num))
//                return true;
//            else
//                map.put(num, 1);
//        }
//        return false;
//    }

    //第二种方式：调用自带函数先把数组从小到大排序，遍历一遍（若该元素和下一个元素相等，返回真，否则假。。。）
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


}
