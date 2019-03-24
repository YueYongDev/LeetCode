package t541;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverseStr("ab", 3));
    }

    public String reverseStr(String s, int k) {
        List<String> strings = getStrList(s, 2 * k);
        StringBuilder sb = new StringBuilder();
        for (String s1 : strings) {
            if (k < s1.length()) {
                StringBuilder sb_temp = new StringBuilder(s1.substring(0, k)).reverse().append(s1.substring(k, s1.length()));
                s1 = sb_temp.toString();
                sb.append(s1);
            } else {
                StringBuilder sb_temp = new StringBuilder(s1).reverse();
                s1 = sb_temp.toString();
                sb.append(s1);
            }
        }
        return sb.toString();
    }

/**
 * 把原始字符串分割成指定长度的字符串列表
 *
 * @param inputString 原始字符串
 * @param length      指定长度
 * @return
 */
public List<String> getStrList(String inputString, int length) {
    int size = inputString.length() / length;
    if (inputString.length() % length != 0) {
        size += 1;
    }
    return getStrList(inputString, length, size);
}

/**
 * 把原始字符串分割成指定长度的字符串列表
 *
 * @param inputString 原始字符串
 * @param length      指定长度
 * @param size        指定列表大小
 * @return
 */
public List<String> getStrList(String inputString, int length,
                               int size) {
    List<String> list = new ArrayList<String>();
    for (int index = 0; index < size; index++) {
        String childStr = substring(inputString, index * length,
                (index + 1) * length);
        list.add(childStr);
    }
    return list;
}

/**
 * 分割字符串，如果开始位置大于字符串长度，返回空
 *
 * @param str 原始字符串
 * @param f   开始位置
 * @param t   结束位置
 * @return
 */
public String substring(String str, int f, int t) {
    if (f > str.length())
        return null;
    if (t > str.length()) {
        return str.substring(f, str.length());
    } else {
        return str.substring(f, t);
    }
}
}
