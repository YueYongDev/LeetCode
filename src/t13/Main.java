package t13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        char[] cs = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int res = 0;
        int temp = 0;     //临时变量
        int value = 0;      //当前罗马值的大小
        for (int i = cs.length - 1; i >= 0; i--) {
            value = hm.get(cs[i]);
            if (temp <= value) {
                res += value;
                temp = value;
            } else {
                res -= value;
                temp = value;
            }
        }
        return res;
    }
}
