package t415;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        int i = 0;
        double res = 0;
        while (res <= n) {
            res = Math.pow(3, i);
            if (res == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
