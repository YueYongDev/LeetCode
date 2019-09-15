package t893;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 因为所有 A[i] 都具有相同的长度，所以没有必要考虑长度问题了
     * 奇数位和偶数位上的所有字符分别一致，就是一组，如abcde、cdabe，两者奇数位上均是a/c/e，偶数位上都是b/d，最后都能通过有限次的交换得到对方
     * 搜集每个字符串中奇数位和偶数位的字符，按字典序排好序后使用Set来筛选，
     * 如abcde的奇数位为ace，偶数位为bd，拼接出来加入Set，即acebd；acbde的奇数位为abe，偶数位为cd，最后拼接为abecd，不为同一组
     */
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            char[] cs = s.toCharArray();
            for (int i = 0; i < cs.length; i++) {
                if (i % 2 == 0) {
                    sb2.append(cs[i]);
                } else {
                    sb1.append(cs[i]);
                }
            }
            char[] cs1 = sb1.toString().toCharArray();
            char[] cs2 = sb2.toString().toCharArray();
            Arrays.sort(cs1);
            Arrays.sort(cs2);
            set.add(new String(cs1) + new String(cs2));
        }
        return set.size();
    }
}
