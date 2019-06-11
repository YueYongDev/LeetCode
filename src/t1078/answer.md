[1078. Bigram 分词](https://leetcode-cn.com/problems/occurrences-after-bigram/)

思路：
其实就是判断字符串中是否存在连续的first和second字串，我们将text按照空格split后，依次遍历，如果当前词为first，就看看他的下一个词是不是second，如果是则将再下一个词放入list中，最后将list转为数组返回即可。

```text
public String[] findOcurrences(String text, String first, String second) {
    List<String> list = new ArrayList<>();
    String[] strings = text.split(" ");
    for (int i = 0; i < strings.length - 2; i++) {
        if (strings[i].equals(first)) {
            if (strings[i + 1].equals(second)) {
                list.add(strings[i + 2]);
            }
        }
    }
    return list.toArray(new String[list.size()]);
}
```