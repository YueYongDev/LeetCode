package t49;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Main main = new Main();
        List<List<String>> lists = main.groupAnagrams(strs);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String baseStr = String.valueOf(cs);
            if (map.containsKey(baseStr)) {
                List<String> list = map.get(baseStr);
                list.add(s);
                map.put(baseStr, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(baseStr, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
