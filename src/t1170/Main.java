package t1170;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] queries = {"bbb", "cc"};
        String[] words = {"a", "aa", "aaa", "aaaa"};
        int[] r = main.numSmallerByFrequency(queries, words);
        for (int i : r) {
            System.out.println(i);
        }
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int[] fwords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            fwords[i] = f(words[i]);
        }
        for (int i = 0; i < queries.length; i++) {
            int ffq = f(queries[i]);
            int count = 0;
            for (int fword : fwords) {
                if (ffq < fword) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    private int f(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] arr = new int[26];
        char[] cs = s.toCharArray();
        for (char c : cs) {
            arr[c - 97]++;
        }
        for (int a : arr) {
            if (a > 0) {
                return a;
            }
        }
        return 0;
    }
}
