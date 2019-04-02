[720. 词典中最长的单词](https://leetcode-cn.com/problems/longest-word-in-dictionary/)


```text
//对数组排序，再利用Set对字母存储，小的单词一定包含在后面大的单词里面。后面只需要取前缀相同的
//对字母排序后，第一个单词一定是共有的，后面只需在此基础上添加
Arrays.sort(words);

Set<String> set = new HashSet<>();
String res = "";
for (String s : words) {
    //如果单词只有一个字母，那一定是共有的
    if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
        res = s.length() > res.length() ? s : res;
        set.add(s);
    }
}
return res;
```