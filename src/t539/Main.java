package t539;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            times[i] = helper(timePoints.get(i));
        }
        // 先排序
        Arrays.sort(times);
        // 比较首尾时间差
        int res = times[0] + 24 * 60 - times[times.length - 1];
        for (int i = 1; i < times.length; i++) {
            res = Math.min(times[i] - times[i - 1], res);
        }
        return res;
    }

    /**
     * 获取该时间字符串对应的分钟数
     *
     * @param s
     * @return
     */
    private int helper(String s) {
        String[] strs = s.split(":");
        return Integer.parseInt(strs[0]) * 60 + Integer.parseInt(strs[1]);
    }
}
