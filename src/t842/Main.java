package t842;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> splitIntoFibonacci(String S) {
        long x = 0;
        long y = 0;

        for (int i = 1; i <= 9 && i < S.length(); i++) {
            if (S.charAt(0) == '0') {
                if (i > 1) {
                    break;
                }
            }
            x = Long.parseLong(S.substring(0, i));
            if (x > Integer.MAX_VALUE) {
                break;
            }
            for (int j = 1; j <= 9 && i + j < S.length(); j++) {
                if (S.charAt(i) == '0') {
                    if (j > 1) {
                        break;
                    }
                }
                y = Long.parseLong(S.substring(i, i + j));
                if (y > Integer.MAX_VALUE) {
                    break;
                }
                List<Integer> list = new ArrayList<>();
                list.add((int) x);
                list.add((int) y);
                long z = x + y;
                long x1 = x;
                long y1 = y;
                String leftS = S.substring(i + j);
                boolean t = true;
                while (true) {
                    if (z > Integer.MAX_VALUE) {
                        t = false;
                        break;
                    }
                    if (!compare(leftS, z + "")) {
                        t = false;
                        break;
                    } else {
                        list.add((int) z);
                    }
                    leftS = leftS.substring((z + "").length());
                    if (leftS.length() == 0) {
                        break;
                    }
                    x1 = y1;
                    y1 = z;
                    z = x1 + y1;
                }
                if (t) {
                    return list;
                }
            }
        }
        return new ArrayList<>();
    }

    private boolean compare(String leftS, String s) {
        if (leftS.length() < s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (leftS.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
