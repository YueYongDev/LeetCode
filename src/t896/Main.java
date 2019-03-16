package t896;

/**
 * https://leetcode-cn.com/problems/monotonic-array/
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1, 1, 0};
        System.out.println(main.isMonotonic(a));
    }

    public boolean isMonotonic(int[] A) {
        int i = 0;
        while (i < A.length - 1) {
            if (A[i] < A[i + 1]) {
                while (++i < A.length - 1) {
                    if (A[i] > A[i + 1])
                        return false;
                }
            } else if (A[i] > A[i + 1]) {
                while (++i < A.length - 1) {
                    if (A[i] < A[i + 1])
                        return false;
                }
            }
            i++;
        }
        return true;
    }
}
