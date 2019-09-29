package t714;

public class Main {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {
        int no = 0;
        int yes = -prices[0];
        for (int price : prices) {
            no = Math.max(no, yes + price - fee);
            yes = Math.max(no - price, yes);
        }
        return Math.max(no, yes);
    }
}
