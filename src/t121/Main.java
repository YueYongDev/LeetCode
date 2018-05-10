package t121;

public class Main {
    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};
        System.out.println(new Main().maxProfit(a));
    }

    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > 0 && diff > max) {
                    max = diff;
                }
            }
        }
        return max;
    }
}
