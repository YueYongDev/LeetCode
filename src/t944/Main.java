package t944;

/**
 * https://leetcode-cn.com/problems/delete-columns-to-make-sorted/
 */
public class Main {
    public static void main(String[] args) {
        String[] A = {"zyx", "wvu", "tsr"};
        System.out.println(new Main().minDeletionSize(A));
    }

    public int minDeletionSize(String[] A) {
        int sum = 0;
        for (int j = 0; j < A[0].length(); j++) {
            int i = 0;
            char c = A[i].charAt(j);
            for (; i < A.length; i++) {
                if (A[i].charAt(j) >= c) {
                    c = A[i].charAt(j);
                } else {
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }
}
