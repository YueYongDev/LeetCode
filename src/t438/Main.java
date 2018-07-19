package t438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        for (int x : main.findAnagrams("abab", "ab")) {
            System.out.println(x);
        }
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int len_long = s.length();
        int len_short = p.length();
        char[] cs = new char[len_short];
        char[] cs_p = p.toCharArray();
        Arrays.sort(cs_p);
        for (int i = 0; i <= len_long - len_short; i++) {
            int index = i;
            for (int j = 0; j < len_short; j++) {
                cs[j] = s.charAt(index);
                index++;
            }
            Arrays.sort(cs);
            if (Arrays.equals(cs_p, cs)) {
                list.add(i);
            }
        }
        return list;
    }
}
