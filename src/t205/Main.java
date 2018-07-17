package t205;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isIsomorphic("ba", "aa"));
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (map.containsKey(s1)) {
                if (map.get(s1) != t1)
                    return false;
            } else if (map.containsValue(t1)) {
                for (Map.Entry<Character, Character> arg : map.entrySet()) {
                    if (arg.getValue() == t1) {
                        if (arg.getKey() != s1)
                            return false;
                    }
                }
            } else {
                map.put(s1, t1);
            }
        }
        return true;
    }
}
