package t122;

public class Main {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(new Main().maxProfit(a));
    }

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }

        return total;
    }
}
