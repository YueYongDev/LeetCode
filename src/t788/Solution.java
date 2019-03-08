package t788;

/**
 * https://leetcode-cn.com/problems/rotated-digits/
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.rotatedDigits(10));
    }

    public int rotatedDigits(int N) {
        int[] a = {2, 5, 6, 9};
        int[] b = {2, 5, 6, 9, 0, 1, 8};
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            boolean flag = false;
            for (char c : (i + "").toCharArray()) {
                if (!isIn(c, b)) {
                    flag = false;
                    break;
                }
                if (isIn(c, a))
                    flag = true;
            }
            if (flag) sum++;
        }
        return sum;
    }

    public boolean isIn(char c, int[] a) {
        for (int x : a) {
            if (x == c - '0')
                return true;
        }
        return false;
    }
}
