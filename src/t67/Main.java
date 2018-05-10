package t67;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(new Main().addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a, 2);
        BigInteger bigInteger2 = new BigInteger(b, 2);
        return (bigInteger1.add(bigInteger2)).toString(2);
    }
}
