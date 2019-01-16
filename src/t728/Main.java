package t728;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> list = main.selfDividingNumbers(66, 708);
        for (int x : list) {
            System.out.println(x);
        }
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 10 != 0 && isNum(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isNum(int x) {
        String s = x + "";
        if (s.contains("0"))
            return false;
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - '0';
            if (x % j != 0)
                return false;

        }
        return true;
    }
}
