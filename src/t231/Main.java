package t231;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isPowerOfTwo(128));

    }

    public boolean isPowerOfTwo(int n) {
        int i = 0;
        double res = 0;
        while (res <= n) {
            res =  Math.pow(2, i);
            if (res == n){
                return true;
            }
            i++;
        }
        return false;
    }
}
