package t66;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = new Main().plusOne(a);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i : digits) {
            stringBuilder.append(i + "");
        }
        BigInteger bigInteger = new BigInteger(stringBuilder.toString()).add(BigInteger.valueOf(1));
        char[] chars = bigInteger.toString().toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i] - '0';
        }
        return result;
    }
}
