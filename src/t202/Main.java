package t202;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isHappy(10));
    }

    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        }
        int pingfanghe = pingfanghe(n);
        int count = 0;
        while (pingfanghe != 1) {
            pingfanghe = pingfanghe(pingfanghe);
            count++;
            if (count == 1000)
                break;
        }
        if (pingfanghe == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int pingfanghe(int n) {
        char[] cs = (n + "").toCharArray();
        int sum = 0;
        for (char c : cs) {
            int x = c - '0';
            sum += (x * x);
        }
        return sum;
    }
}
