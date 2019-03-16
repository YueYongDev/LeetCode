package t1005;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] A = {1, 3, 2, 6, 7, 9};
        int K = 3;
        System.out.println(main.largestSumAfterKNegations(A, K));
    }

    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int negativeNum = negativeNum(A);
        if (K <= negativeNum) {
            for (int i = 0; i < K; i++) {
                A[i] = Math.abs(A[i]);
            }
            return sumOfArray(A);
        } else {
            int x = K - negativeNum;
            for (int i = 0; i < negativeNum; i++) {
                A[i] = Math.abs(A[i]);
            }
            if (x % 2 == 0) {
                return sumOfArray(A);
            } else {
                Arrays.sort(A);
                A[0]=-A[0];
                return sumOfArray(A);
            }
        }
    }

    public int negativeNum(int[] a) {
        int sum = 0;
        for (int x : a) {
            if (x < 0) {
                sum++;
            }
        }
        return sum;
    }

    public int sumOfArray(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }
}
