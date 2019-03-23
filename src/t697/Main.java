package t697;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/degree-of-an-array/
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1, 2, 2, 3, 1};
        System.out.println(main.findShortestSubArray(a));
    }

    public int findShortestSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //存储频率最大的几个数
        List<Integer> maxNum = new ArrayList<>();
        //存储每个数的频率
        Map<Integer, Integer> fre = new HashMap<>();
        //存储频率最大的数的度
        Map<Integer, int[]> degree = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int frequency = fre.getOrDefault(num, 0) + 1;
            if (frequency > fre.getOrDefault(max, 0)) {
                maxNum.clear();
                maxNum.add(num);
                max = num;
            } else if (frequency == fre.getOrDefault(max, 0)) {
                maxNum.add(num);
            }
            fre.put(num, frequency);
            int d = degree.getOrDefault(num, new int[]{i, i})[0];
            degree.put(num, new int[]{d, i});
        }
        for (int i : maxNum) {
            int d = degree.get(i)[1] - degree.get(i)[0];
            if (d < min) min = d;
        }
        return min + 1;
    }

}
