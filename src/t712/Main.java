package t712;

public class Main {
    public static void main(String[] args) {

    }

    public int minimumDeleteSum(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        int sum = 0;
        for (int i = 0; i < n1; i++) {
            sum += s1.charAt(i);
            for (int j = 0; j < n2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + s1.charAt(i);
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        for (int i = 0; i < n2; i++) {
            sum += s2.charAt(i);
        }
        return sum - dp[n1][n2] * 2;
    }
}
