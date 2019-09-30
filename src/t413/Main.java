package t413;

public class Main {
    public static void main(String[] args) {

    }

    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        for (int s = 0; s < A.length - 2; s++) {
            int d = A[s + 1] - A[s];
            for (int e = s + 2; e < A.length; e++) {
                int i = 0;
                for (i = s + 1; i <= e; i++) {
                    if (A[i] - A[i - 1] != d) {
                        break;
                    }
                }
                if (i > e) {
                    count++;
                }
            }
        }
        return count;
    }
}
