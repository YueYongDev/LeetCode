package t833;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] indexes = {4, 0, 7};
        String[] sources = {"mey", "vye", "ggv"};
        String[] targets = {"bq", "aa", "aqq"};
        System.out.println(main.findReplaceString("vyeqmeyggv", indexes, sources, targets));
    }

    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int arrLen = indexes.length;
        if (arrLen <= 0) {
            return S;
        }
        Map<Integer, String[]> map = new TreeMap<>();
        for (int i = 0; i < arrLen; i++) {
            map.put(indexes[i], new String[]{sources[i], targets[i]});
        }
        StringBuilder sb = new StringBuilder(S);
        int i = 0, d = 0;
        for (int index : map.keySet()) {
            String source = map.get(index)[0];
            String target = map.get(index)[1];
            if (S.indexOf(source, index) == index) {
                i = i + index + d;
                sb.replace(i, i + source.length(), target);
                d = target.length() - source.length() - index;
            }
        }
        return sb.toString();
    }
}
