package t506;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] a = {4, 3, 5, 2};
        for (String s : new Main().findRelativeRanks(a)) {
            System.out.println(s);
        }
    }

    public String[] findRelativeRanks(int[] nums) {
        int nums2[] = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            nums2[j] = nums[j];
        }
        Arrays.sort(nums2);  //得到升序排序的数组

        //以分数作为key,排名作为value构建哈希表
        int i = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int j = nums2.length - 1; j >= 0; j--) {
            map.put(nums2[j], i);
            i++;
        }
        String s[] = new String[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int temp = map.get(nums[j]);  //得到相应分数的排名
            if (temp == 1) {
                s[j] = "Gold Medal";
            } else if (temp == 2) {
                s[j] = "Silver Medal";
            } else if (temp == 3) {
                s[j] = "Bronze Medal";
            } else {
                s[j] = "" + temp;
            }
        }
        return s;
    }
}
