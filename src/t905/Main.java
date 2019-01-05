package t905;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {3, 1, 2, 4};
        int[] x = main.sortArrayByParity(a);
        for (int xx : x) {
            System.out.println(xx);
        }
    }

    public int[] sortArrayByParity(int[] A) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int x : A) {
            if (x % 2 == 0)
                list1.add(x);
            else
                list2.add(x);
        }
        int[] x = new int[list1.size() + list2.size()];
        for (int i = 0; i < list1.size(); i++) {
            x[i] = list1.get(i);
        }
        for (int i = list1.size(); i < list1.size() + list2.size(); i++) {
            x[i] = list2.get(i - list1.size());
        }
        return x;
    }
}
