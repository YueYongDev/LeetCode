package t916;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public List<String> wordSubsets(String[] A, String[] B) {
        int[] bmax = getStringArr("");
        for (String b : B) {
            int[] bcount = getStringArr(b);
            for (int i = 0; i < 26; i++) {
                bmax[i] = Math.max(bmax[i], bcount[i]);
            }
        }
        List<String> list = new ArrayList<>();

        search:
        for (String a : A) {
            int[] aCount = getStringArr(a);
            for (int i = 0; i < 26; ++i) {
                if (aCount[i] < bmax[i]) {
                    continue search;
                }
            }
            list.add(a);
        }

        return list;
    }

    private int[] getStringArr(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        return arr;
    }
}
