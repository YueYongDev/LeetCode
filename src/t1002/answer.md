[1002. 查找常用字符](https://leetcode-cn.com/problems/find-common-characters/)

本题可以理解为求每个字符串之间字符数量的交集，以示例1为例：
```
输入：["bella","label","roller"]
输出：["e","l","l"]
```
我们知道第一个字符串的字符数量列表为：
```text
b 1
e 1
l 2
a 1
```
第二个字符串的字符数量列表为：
```text
l 2
a 1
b 1
e 1
```
第三个字符串的字符数量列表为：
```text
r 2
o 1
l 2
e 1
```
这三个求交集后的结果为：
```text
e 1
l 2
```
结果一目了然。

分析到这里其实也没啥好说的了，我们可以用hashmap来表示**字符-数量**之间的关系，但是考虑到效率的问题，我们可以使用数组来对代码进行优化。用数组res的下标i表示是哪个字符，用res[i]表示该字符出现的次数。代码如下：
```text
public List<String> commonChars(String[] A) {
    List<String> list = new ArrayList<>();
    int[] res = new int[26];
    for (char c : A[0].toCharArray()) {
        res[c - 'a']++;
    }
    for (int i = 1; i < A.length; i++) {
        int[] temp = new int[26];
        for (char c : A[i].toCharArray()) {
            temp[c - 'a']++;
        }
        for (int j = 0; j < 26; j++) {
            res[j] = Math.min(res[j], temp[j]);
        }
    }
    for (int i = 0; i < res.length; i++) {
        if (res[i] > 0) {
            for (int j = 0; j < res[i]; j++) {
                list.add(((char) ('a' + i) + ""));
            }
        }
    }
    return list;
}
```

以上皆为本人拙见，若有谬误，欢迎指正