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
        char[] ss = s.toCharArray();
        char[] ps = p.toCharArray();
        int[] pmap = new int[26];
        for (char c : ps) {
            pmap[c - 'a']++;
        }
        for (int i = 0; i < ss.length - ps.length + 1; i++) {
            char[] temp = new char[ps.length];
            int num = 0;
            for (int j = i; j < i + ps.length; j++) {
                temp[num++] = ss[j];
            }
            int[] smap = new int[26];
            for (char c : temp) {
                smap[c - 'a']++;
            }
            boolean equal = true;
            for (int j = 0; j < 26; j++) {
                if (pmap[j] != smap[j]) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                list.add(i);
            }
        }
        return list;
    }
}
