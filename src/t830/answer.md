[830. 较大分组的位置](https://leetcode-cn.com/problems/positions-of-large-groups/)

用双指针遍历，i为始指针，j为尾指针，外层为for循环，用于更新始指针i的值，内层为while循环（连续的计数通常使用while循环），用于更新尾指针j的值，不断遍历后更新尾指针的值，如果j-i>=3，就可以添加到list中了，然后在更新始指针i即可。

```text
public List<List<Integer>> largeGroupPositions(String S) {
    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < S.length(); ) {
        int j = i;
        while (j < S.length() && S.charAt(j) == S.charAt(i)) {
            j++;
        }
        if (j - i >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(j - 1);
            lists.add(list);
        }
        i = j;
    }
    return lists;
}
```