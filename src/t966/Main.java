package t966;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] wordlist = {"v", "t", "k", "g", "n", "k", "u", "h", "m", "p" };
        String[] queries = {"n", "g", "k", "q", "m", "h", "x", "t", "p", "p" };
        String[] res = main.spellchecker(wordlist, queries);
        for (String s : res) {
            System.out.println(s);
        }
    }

    private Set<String> words_perfect;
    private Map<String, String> words_cap;
    private Map<String, String> words_vow;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        words_perfect = new HashSet();
        words_cap = new HashMap();
        words_vow = new HashMap();

        for (String word : wordlist) {
            words_perfect.add(word);

            String wordlow = word.toLowerCase();
            words_cap.putIfAbsent(wordlow, word);

            String wordlowDV = devowel(wordlow);
            words_vow.putIfAbsent(wordlowDV, word);
        }

        String[] ans = new String[queries.length];
        int t = 0;
        for (String query : queries) {
            ans[t++] = solve(query);
        }
        return ans;
    }

    public String solve(String query) {
        if (words_perfect.contains(query)) {
            return query;
        }

        String queryl = query.toLowerCase();
        if (words_cap.containsKey(queryl)) {
            return words_cap.get(queryl);
        }

        String querylv = devowel(queryl);
        if (words_vow.containsKey(querylv)) {
            return words_vow.get(querylv);
        }

        return "";
    }

    public String devowel(String word) {
        StringBuilder ans = new StringBuilder();
        for (char c : word.toCharArray()) {
            ans.append(isVowel(c) ? '*' : c);
        }
        return ans.toString();
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
