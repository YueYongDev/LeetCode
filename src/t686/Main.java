package t686;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.repeatedStringMatch("abc", "cabcabca"));
    }

    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder sb = new StringBuilder(A);
        while (sb.length() <= A.length() * 2 + B.length()) {
            if (sb.indexOf(B) == -1) {
                sb.append(A);
                count++;
            } else {
                return count;
            }
        }
        return -1;
    }
}
