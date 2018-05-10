package t172;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.trailingZeroes(7));
    }

    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n/5 + trailingZeroes(n/5);
    }
}
