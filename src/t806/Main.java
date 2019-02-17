package t806;

/**
 * https://leetcode-cn.com/problems/number-of-lines-to-write-string/
 */

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        int[] width={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s="bbbcccdddaaa";
        int[] res=main.numberOfLines(width,s);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public int[] numberOfLines(int[] widths, String S) {
        char[] cs = S.toCharArray();
        int sum = 0;
        int row = 1;
        for (char c : cs) {
            sum += widths[c - 'a'];
            if (sum > 100) {
                sum = widths[c - 'a'];
                row++;
            } else if (sum == 100) {
                sum = 0;
                row++;
            }
        }
        int[] res = {row, sum};
        return res;
    }
}
