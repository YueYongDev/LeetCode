package t867;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        main.print(main.transpose(A));
    }

    public int[][] transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                T[i][j] = A[j][i];
            }
        }
        return T;
    }

    public void print(int[][] A) {
        for (int[] x : A) {
            for (int xx : x) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}
