package t767;

public class Main {
    public static void main(String[] args) {

    }

    public String reorganizeString(String S) {
        if (S.length() == 1) {
            return S;
        }
        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (max < x) {
                max = x;
            }
        }
        if (max > (S.length() + 1) / 2) {
            return "";
        }
        char[] cs = new char[S.length()];
        int enev = 0, odd = 1;
        for (int i = 0; i < 26; i++) {
            // 先把奇数位填满
            while (arr[i] > 0 && odd < S.length() && arr[i] < (S.length() / 2 + 1)) {
                cs[odd] = (char) ('a' + i);
                arr[i]--;
                odd += 2;
            }
            // 再填偶数位
            while (arr[i] > 0) {
                cs[enev] = (char) ('a' + i);
                arr[i]--;
                enev += 2;
            }
        }
        return new String(cs);
    }
}
