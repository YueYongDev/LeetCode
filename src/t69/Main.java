package t69;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().mySqrt(2147395600));
    }

    public int mySqrt(int x) {
        int low = 0, high = 46341, mid = 0;

        while (low <= high) {
            if (mid == low + (high - low) / 2) {
                break;
            }
            mid = low + (high - low) / 2;
            int square = mid * mid;

            if (square == x) {
                return mid;
            } else if (x > square) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return mid;
    }
}
