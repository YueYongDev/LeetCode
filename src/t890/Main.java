package t890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
            if (helper(s, pattern)) {
                list.add(s);
            }
        }
        return list;
    }

    private boolean helper(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        char[] cs_word = word.toCharArray();
        char[] cs_pattern = pattern.toCharArray();
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!map1.containsKey(cs_word[i])) {
                map1.put(cs_word[i], cs_pattern[i]);
            }
            if (!map2.containsKey(cs_pattern[i])) {
                map2.put(cs_pattern[i], cs_word[i]);
            }
            if (map1.get(cs_word[i]) != cs_pattern[i] || map2.get(cs_pattern[i]) != cs_word[i]) {
                return false;
            }
        }
        return true;
    }
}
