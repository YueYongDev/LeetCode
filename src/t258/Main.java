package t258;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.addDigits(10));
    }

    public int addDigits(int num) {
        int sum = num;
        while (sum >= 10) {
            char[] cs = (sum + "").toCharArray();
            int x = 0;
            for (char c : cs) {
                x += (c - '0');
            }
            sum = x;
        }
        return sum;
    }
}
