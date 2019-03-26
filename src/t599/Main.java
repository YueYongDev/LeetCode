package t599;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] s1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] s2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        Main main = new Main();
        String[] ss = main.findRestaurant(s1, s2);
        for (String s : ss) {
            System.out.println(s);
        }
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i]))
                map2.put(list2[i], map.get(list2[i]) + i);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map2.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> t : list) {
            if (t.getValue() <= min) {
                min = t.getValue();
                result.add(t.getKey());
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
