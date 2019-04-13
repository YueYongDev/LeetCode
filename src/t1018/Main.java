package t1018;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {0, 1, 1, 1, 1, 1};
        List<Boolean> list = main.prefixesDivBy5(a);
        for (Boolean b : list) {
            System.out.println(b);
        }
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int mod = 0;
        for (int i : A) {
            mod = (mod * 2 + i) % 5;
            if (mod == 0)
                list.add(true);
            else list.add(false);
        }
        return list;
    }
}
