package t791;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.customSortString("jftiugkz", "kfiukutzjg"));
    }

    public String customSortString(String S, String T) {
        int m = S.length(), n = T.length();
        //记录T中的字符个数
        int[] map = new int[26];
        //记录S是否包含某个字符
        int[] map1 = new int[26];
        for (int i = 0; i < m; i++) {
            char c = S.charAt(i);
            map1[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = T.charAt(i);
            int t = c - 'a';
            map[t]++;
            //如果S中不包含该字符，直接加上
            if (map1[t] == 0) {
                sb.append(c);
            }
        }
        //按照S中的顺序，包含几次加几次
        for (int i = 0; i < m; i++) {
            char c = S.charAt(i);
            int cnt = map[c - 'a'];
            if (cnt > 0) {
                for (int k = 0; k < cnt; k++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
