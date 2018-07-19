package t500;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        for (String s : main.findWords(words)) {
            System.out.println(s);
        }
    }

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
            if (isIn(s))
                list.add(s);
        }
        String[] strings = new String[list.size()];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = list.get(i);
        }
        return strings;
    }

    public boolean isIn(String s) {
        char[] cs1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] cs2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] cs3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (isCharIn(cs1, s.charAt(i))) {
                for (int j = i; j < s.length(); j++) {
                    if (!isCharIn(cs1, s.charAt(j)))
                        return false;
                }
            }

            if (isCharIn(cs2, s.charAt(i))) {
                for (int j = i; j < s.length(); j++) {
                    if (!isCharIn(cs2, s.charAt(j)))
                        return false;
                }
            }

            if (isCharIn(cs3, s.charAt(i))) {
                for (int j = i; j < s.length(); j++) {
                    if (!isCharIn(cs3, s.charAt(j)))
                        return false;
                }
            }
        }
        return true;
    }

    public boolean isCharIn(char[] cs, char c) {
        for (char cc : cs) {
            if (c == cc)
                return true;
        }
        return false;
    }
}
