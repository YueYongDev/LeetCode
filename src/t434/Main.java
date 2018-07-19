package t434;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.countSegments("Hello"));
    }

    public int countSegments(String s) {
        if (s.length() == 0) return 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (check(s.charAt(i))) {
                ans++;
                while (i != s.length() && check(s.charAt(i))) i++;
            }
        }
        if (check(s.charAt(0))) ans--;
        if (check(s.charAt(s.length() - 1))) ans--;
        return ans + 1;
    }

    boolean check(char c) {
        return c == ' ';
    }

}
