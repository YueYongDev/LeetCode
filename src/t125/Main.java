package t125;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] s1 = s.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] >= 48 && s1[i] <= 57 || s1[i] >= 97 && s1[i] <= 122) {
                characters.add(s1[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : characters) {
            stringBuilder.append(c);
        }
        String sx = stringBuilder.toString();
        String s0 = stringBuilder.reverse().toString();
        return s0.equals(sx);
    }
}
