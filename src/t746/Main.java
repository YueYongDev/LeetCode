package t746;

public class Main {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(new Main().minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            int A = dp[i - 1] + cost[i - 1];
            int B = dp[i - 2] + cost[i - 2];
            dp[i] = Math.min(A, B);
        }
        return dp[cost.length];
    }
}
