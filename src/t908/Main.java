package t908;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {0,10};
        System.out.println(main.smallestRangeI(a, 2));
    }

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        return (A[0] + K <= A[A.length - 1] - K) ? A[A.length - 1] - 2 * K - A[0] : 0;
    }
}
