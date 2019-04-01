package t970;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> list = main.powerfulIntegers(2, 3, 10);
        for (int x : list) {
            System.out.println(x);
        }
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();

        for (int a = 1; a < bound; a *= x) {
            for (int b = 1; a + b <= bound; b *= y) {
                set.add(a + b);
                if (y == 1) break;
            }
            if (x == 1) break;
        }

        return new ArrayList<>(set);
    }
}
