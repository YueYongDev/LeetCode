package t168;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            if (n % 26 == 0) {
                s.append('Z');
                n -= 26;
            } else {
                s.append((char) (n % 26 - 1 + 'A'));
                n -= n % 26;
            }
            n = n / 26;
        }
        return s.reverse().toString();
    }
}
