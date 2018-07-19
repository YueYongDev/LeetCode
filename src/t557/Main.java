package t557;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length - 1; i++) {
            sb.append(new StringBuilder(ss[i]).reverse()).append(" ");
        }
        return sb.append(new StringBuilder(ss[ss.length - 1]).reverse()).toString();
    }
}
