package t1023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        for (String s : queries) {
            list.add(isMatch(s, pattern));
        }
        return list;
    }

    private boolean isMatch(String word, String pattern) {
        int idx1 = 0, idx2 = 0, len1 = word.length(), len2 = pattern.length();
        while (idx1 < len1 && idx2 < len2) {
            char ch1 = word.charAt(idx1), ch2 = pattern.charAt(idx2);
            if (ch1 == ch2) {
                idx1++;
                idx2++;
            } else {
                if (ch1 >= 'A' && ch1 <= 'Z') {
                    return false;
                }
                idx1++;
            }
        }
        if (idx2 != len2) {
            return false;
        }
        while (idx1 < len1) {
            char ch = word.charAt(idx1);
            if (ch >= 'A' && ch <= 'Z') {
                return false;
            }
            idx1++;
        }
        return true;
    }
}
