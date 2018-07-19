package t389;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.findTheDifference("abcd", "abcde"));
    }

    public char findTheDifference(String s, String t) {
        char[] cs1 = s.toCharArray();
        char[] cs2 = t.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);
        for (int i = 0; i < cs1.length; i++) {
            if (cs1[i] != cs2[i])
                return cs2[i];
        }
        return cs2[cs2.length - 1];
    }
}
