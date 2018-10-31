package t455;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        System.out.println(new Main().findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int index = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = index; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    index = j + 1;
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
