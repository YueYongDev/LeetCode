package t931;

public class Main {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Main main = new Main();
        System.out.println(main.minFallingPathSum(A));
    }

    public int minFallingPathSum(int[][] A) {
        int len = A.length;
        int[][] dp = new int[len][len];
        for (int j = 0; j < A.length; j++) {
            dp[0][j] = A[0][j];
        }
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + A[i][0];
            for (int j = 1; j < len - 1; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j + 1])) + A[i][j];
            }
            dp[i][len - 1] = Math.min(dp[i - 1][len - 2], dp[i - 1][len - 1]) + A[i][len - 1];
        }
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < len; j++) {
            res = Math.min(res, dp[len - 1][j]);
        }
        return res;
    }
}
