package t461;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.hammingDistance(1, 4);
    }

    public int hammingDistance(int x, int y) {
        String x1 = Integer.toBinaryString(x);
        String y1 = Integer.toBinaryString(y);
        int sum = 0;

        System.out.println(x1);
        System.out.println(y1);
        for (int i = 0; i < x1.length(); i++) {
            if (x1.charAt(i) != y1.charAt(i)) {
                sum++;
            }
        }
        return sum;
    }
}
