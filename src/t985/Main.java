package t985;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queris = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        Main main = new Main();
        int[] b = main.sumEvenAfterQueries(A, queris);
        for (int x : b) {
            System.out.println(x);
        }
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] B = new int[A.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            A[query[1]] += query[0];
            B[i] = sum_of_even_number(A);
        }
        return B;
    }

    // 求数组中的偶数和
    public int sum_of_even_number(int[] A) {
        int sum = 0;
        for (int x : A) {
            if (Math.abs(x) % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
