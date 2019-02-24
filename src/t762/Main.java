package t762;

/**
 * https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.countPrimeSetBits(10,15));
    }

    public int countPrimeSetBits(int L, int R) {
        int sum=0;
        for (int i = L; i <= R; i++) {
            String s=Integer.toBinaryString(i);
            if (isPrime(oneInString(s)))
                sum++;
        }
        return sum;
    }

    //判断字符串中有几个1
    public int oneInString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                sum++;
        }
        return sum;
    }

    //判断是不是素数
    public boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0) return false;
        return true;
    }
}
