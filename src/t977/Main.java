package t977;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10};
        int[] b = new Main().sortedSquares(a);
        for (int x : b) {
            System.out.println(x);
        }
    }

    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = Math.multiplyExact(A[i], A[i]);
        }
        Arrays.sort(B);
        return B;
    }
}
