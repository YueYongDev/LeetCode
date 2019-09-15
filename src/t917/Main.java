package t917;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (helper(c)) {
                sb.append(c);
            }
        }
        sb.reverse();
        for (int i = 0; i < S.length(); i++) {
            if (!helper(S.charAt(i))) {
                sb.insert(i, S.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 判断是否是字母
     *
     * @return
     */
    private boolean helper(char c) {
        return Character.isLowerCase(c) || Character.isUpperCase(c);
    }
}
