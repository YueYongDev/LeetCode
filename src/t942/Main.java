package t942;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] x = main.diStringMatch("DDI");
        for (int a : x) {
            System.out.println(a);
        }
    }

    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int I = 0, D = S.length(), end = D;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                res[i] = I++;
            } else if (S.charAt(i) == 'D') {
                res[i] = D--;
            }
        }
        res[end] = I;
        return res;
    }
}
