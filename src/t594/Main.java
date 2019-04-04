package t594;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 3, 1, 3, 3, 3, 0, 1, 0, 2, 0, 3, 1, 3, -3, 2, 0, 3, 1, 2, 2, -3, 2, 2, 3, 3};
        Main main = new Main();
        System.out.println(main.findLHS(nums));
    }

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs(list.get(i + 1) - list.get(i)) == 1) {
                int temp = Math.abs(map.get(list.get(i + 1)) + map.get(list.get(i)));
                if (temp > max)
                    max = temp;
            }
        }
        return max;
    }
}
