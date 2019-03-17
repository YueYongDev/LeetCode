package t696;

/**
 * https://leetcode-cn.com/problems/count-binary-substrings/
 */

/**
 * 满足要求的字符串其中间必然有一个"10"或"01"的种子，找到这个种子，然后字符串像两侧扩张。
 */

public class Main {
    public static void main(String[] args) {

    }

    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                int cnt = 1;
                int low = i - 1;
                int high = i + 2;
                while (low >= 0 && high < chars.length) {
                    if (chars[low] == chars[low + 1] && chars[high - 1] == chars[high]) {
                        low--;
                        high++;
                        cnt++;
                    } else break;
                }
                result += cnt;
            }
        }
        return result;
    }
}
