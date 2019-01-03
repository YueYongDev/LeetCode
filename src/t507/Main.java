package t507;

/**
 * https://leetcode-cn.com/problems/perfect-number/
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.checkPerfectNumber(1));
    }

    public boolean checkPerfectNumber(int num) {
        if (num<=1) return false;
        int sum = 1;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum =sum+i+num/i;
            }
        }
        return sum == num;
    }
}
