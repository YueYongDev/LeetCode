package t830;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/positions-of-large-groups/
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<List<Integer>> lists = main.largeGroupPositions("abbxxxxzzy");
        for (List list : lists) {
            System.out.println(list.get(0) + " " + list.get(1));
        }

    }

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < S.length(); ) {
            int j = i;
            while (j < S.length() && S.charAt(j) == S.charAt(i)) {
                j++;
            }
            if (j - i >= 3) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j - 1);
                lists.add(list);
            }
            i = j;
        }
        return lists;
    }
}
