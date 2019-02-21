package t976;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {2, 1, 2};
        System.out.println(main.largestPerimeter(a));
    }

    public int largestPerimeter(int[] A) {
        if (A.length < 3) return 0;
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) return A[i] + A[i + 1] + A[i + 2];
        }
        return 0;
    }
}
