package t171;

public class Main {
    public static void main(String[] args) {
        String s = "ABADASKDKXK";
        System.out.println(new Main().titleToNumber(s));
    }

    public int titleToNumber(String s) {
        char[] cs = s.toCharArray();
        int num = 0;
        int index = cs.length - 1;
        for (char c : cs) {
            num += ((c - 'A' + 1) * Math.pow(26, index));
            index--;
        }
        return num;
    }
}
