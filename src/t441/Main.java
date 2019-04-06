package t441;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }
}
