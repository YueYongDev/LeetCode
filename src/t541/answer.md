[541. 反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)

该题分为两步：
1. 将字符串按照2k的长度分割成一个数组
2. 遍历该数组元素进行反转匹配即可
3. 注意处理下边界值

下面是按照规定长度拆分字符串的代码，可以封装成一个工具类

```java
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
```