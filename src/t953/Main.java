package t953;

/**
 * https://leetcode-cn.com/problems/verifying-an-alien-dictionary/
 */
public class Main {

    public static void main(String[] args) {

    }

    public boolean isAlienSorted(String[] words, String order) {
        int[] x = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            x[c - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            for (int j = 0; j < word1.length(); j++) {
                char cw1 = word1.charAt(j);
                char cw2;
                if (word2.length() > j)
                    cw2 = word2.charAt(j);
                else return false;
                if (cw1 == cw2) continue;
                if (x[cw1 - 'a'] < x[cw2 - 'a']) break;
                if (x[cw1 - 'a'] > x[cw2 - 'a']) return false;
            }
        }
        return true;
    }
}
