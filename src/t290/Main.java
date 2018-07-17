package t290;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String pattern = "abba";
        String str = "dog dog dog dog";
        System.out.println(main.wordPattern(pattern, str));
    }

    public boolean wordPattern(String pattern, String str) {
        char[] cs = pattern.toCharArray();
        String[] ss = str.split(" ");
        if (ss.length != cs.length)
            return false;
        else {
            HashMap<Character, String> map = new HashMap<>();
            for (int i = 0; i < cs.length; i++) {
                if (map.containsKey(cs[i])) {
                    if (!map.get(cs[i]).equals(ss[i])) {
                        return false;
                    }
                } else if (map.containsValue(ss[i])) {
                    for (Map.Entry<Character, String> args : map.entrySet()) {
                        if (args.getValue().equals(ss[i])) {
                            if (args.getKey() != cs[i])
                                return false;
                        }
                    }
                } else {
                    map.put(cs[i], ss[i]);
                }
            }
        }
        return true;
    }
}
