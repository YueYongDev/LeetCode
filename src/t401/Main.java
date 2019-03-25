package t401;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-watch/
 */

public class Main {

    public static void main(String[] args) {

    }

    public List<String> readBinaryWatch(int num) {
        List<String> strings = new ArrayList<>();
        int[] dp = new int[60];
        for (int i = 0; i < dp.length; i++) dp[i] = calculate(i);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (dp[i] + dp[j] == num)
                    strings.add(new String(i + ":" + (j > 10 ? j : "0" + j)));
            }
        }
        return strings;
    }

    private int calculate(int i) {
        int res = 0;
        String s = Integer.toBinaryString(i);
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1')
                res++;
        }
        return res;
    }
}
