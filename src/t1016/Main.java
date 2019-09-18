package t1016;

public class Main {
    public static void main(String[] args) {

    }

    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            String s = Integer.toBinaryString(i);
            if (!S.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
