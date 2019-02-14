package t821;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String S = "loveleetcode";
        char C = 'e';
        int[] res = main.shortestToChar(S, C);
        for (int x : res) {
            System.out.println(x);
        }
    }

    public int[] shortestToChar(String S, char C) {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C)
                index.add(i);
        }
        int[] res = new int[S.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = minDistance(i, index);
        }
        return res;

    }

    public int minDistance(int i, List<Integer> a) {
        int min = Integer.MAX_VALUE;
        for (int x : a) {
            if (min > Math.abs(x - i))
                min = Math.abs(x - i);
        }
        return min;
    }

}
