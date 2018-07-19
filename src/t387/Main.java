package t387;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.firstUniqChar(""));
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (int i = 0; i < cs.length; i++) {
            if (map.get(cs[i]) == 1)
                return i;
        }

        return -1;
    }
}
