package t58;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().lengthOfLastWord(""));
    }

    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        String[] ss = s.split(" ");
        if (ss.length == 0)
            return 0;
        else
            return ss[ss.length - 1].length();
    }
}
