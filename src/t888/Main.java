package t888;

/**
 * https://leetcode-cn.com/problems/fair-candy-swap/
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {8, 73, 2, 86, 32};
        int[] b = {56, 5, 67, 100, 31};
        int[] res = main.fairCandySwap(a, b);
        System.out.println(res[0] + " " + res[1]);
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int[] res = new int[2];
        int sumA = sumOfArray(A);
        int sumB = sumOfArray(B);
        for (int x : A) {
            int temp = (sumB - sumA) / 2 + x;
            if (contains(temp, B)) {
                res[0] = x;
                res[1] = temp;
                return res;
            }
        }
        return res;
    }

    public boolean contains(int x, int[] B) {
        for (int b : B) {
            if (x == b)
                return true;
        }
        return false;
    }

    public int sumOfArray(int[] A) {
        int sum = 0;
        for (int x : A)
            sum += x;

        return sum;
    }
}
