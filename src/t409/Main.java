package t409;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.longestPalindrome("ccc"));
    }

    public int longestPalindrome(String s) {
        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : cs) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        if (map.size() != 1) {
            boolean flag = false;
            int sum = 0;
            for (int x : map.values()) {
                if (x % 2 != 0) {
                    flag = true;
                    sum += (x - 1);
                } else
                    sum += x;
            }
            if (flag)
                return sum + 1;
            else
                return sum;
        } else
            return s.length();

    }
}
