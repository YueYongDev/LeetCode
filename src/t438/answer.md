[438. 找到字符串中所有字母异位词](https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/)

根据题意我们第一想法肯定是把s遍历一遍，然后找出其中所有的和p的长度相同的子串，判断是不是p的字母异位词，所以重点就在如何判断是不是p的字母异位词了。

这里先给出几种想法：
1. 用全排列的方式找出p的所有排列方式，放入一个list中，然后遍历s的时候逐一比较，判断是否在该list中。
2. 字母异位词有个特点就是不管顺序怎么变，构成这个词的字母是固定的，所以我们可以将p和待比较的进行某种约束，限制其排列顺序使其保持一致，最好的方式就是排序了。
3. 刚开始的想法是和2一致，但是我们可以从词频的角度去考虑，既然字母是固定的，那词频也肯定是固定的，统计每个片段的词频的复杂度肯定是小于对每个片段进行排序的复杂度的。、

上述三种方式都进行试验过，只有3没有超时，这里放出代码
```text
public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list = new ArrayList<>();
    char[] ss = s.toCharArray();
    char[] ps = p.toCharArray();
    int[] pmap = new int[26];
    for (char c : ps) {
        pmap[c - 'a']++;
    }
    for (int i = 0; i < ss.length - ps.length + 1; i++) {
        char[] temp = new char[ps.length];
        int num = 0;
        for (int j = i; j < i + ps.length; j++) {
            temp[num++] = ss[j];
        }
        int[] smap = new int[26];
        for (char c : temp) {
            smap[c - 'a']++;
        }
        boolean equal = true;
        for (int j = 0; j < 26; j++) {
            if (pmap[j] != smap[j]) {
                equal = false;
                break;
            }
        }
        if (equal) {
            list.add(i);
        }
    }
    return list;
}
```