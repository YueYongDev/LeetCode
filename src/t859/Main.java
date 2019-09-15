package t859;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 三张情况
     * 1. 字符串长度不相等, 直接返回false
     * 2. 字符串相等的时候, 只要有重复的元素就返回true
     * 3. A, B字符串有不相等的两个地方, 需要查看它们交换后是否相等即可.
     *
     * @param A
     * @param B
     * @return
     */
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < A.length(); i++) {
                boolean res = set.add(A.charAt(i));
                if (!res) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        // 说明两个字符串不同之处已经超过了2
                        return false;
                    }
                }
            }
            // second等于-1说明两个字符串只有一处不同
            return (second != -1 && A.charAt(first) == B.charAt(second)) && A.charAt(second) == B.charAt(first);
        }
    }
}
