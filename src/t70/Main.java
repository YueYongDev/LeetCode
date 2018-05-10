package t70;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().climbStairs(1));
    }

    public int climbStairs(int n) {
        if (n > 2) {
            int[] a = new int[n + 1];
            a[1] = 1;
            a[2] = 2;
            for (int i = 3; i <= n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            return a[n];
        } else {
            return n;
        }

    }
}
