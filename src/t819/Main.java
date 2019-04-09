package t819;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String[] banned = {"a"};
        String s = "a, a, a, a, b,b,b,c, c";
        System.out.println(main.mostCommonWord(s, banned));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] strings = paragraph.split("\\s+");
        for (String s : strings) {
//            System.out.println(s);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        list.sort((o1, o2) -> (o2.getValue() - o1.getValue()));
        for (Map.Entry<String, Integer> t : list) {
//            System.out.println(t.getKey() + " " + t.getValue());
            if (!useListContains(banned, t.getKey())) {
                res = t.getKey();
                break;
            }
        }
        return res;
    }

    public boolean useListContains(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }
}
