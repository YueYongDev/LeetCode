package t598;

public class Main {
    public static void main(String[] args) {

    }

    public int maxCount(int m, int n, int[][] ops) {
        for (int[] ints : ops) {
            if (ints[0] < m) {
                m = ints[0];
            }
            if (ints[1] < n) {
                n = ints[1];
            }
        }
        return m * n;
    }
}
