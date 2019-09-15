package t91;

public class Main {
    public static void main(String[] args) {

    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int pre = 1;
        int curr = 1;
        char[] cs = s.toCharArray();
        for (int i = 1; i < cs.length; i++) {
            int temp = curr;
            if (cs[i] == '0') {
                if (cs[i - 1] == '1' || cs[i - 1] == '2') {
                    curr = pre;
                } else {
                    return 0;
                }
            } else if (cs[i - 1] == '1' || (cs[i - 1] == '2' && cs[i] >= '1' && cs[i] <= '6')) {
                curr += pre;
            }
            pre = temp;
        }
        return curr;
    }
}
