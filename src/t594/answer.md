[594. 最长和谐子序列](https://leetcode-cn.com/problems/longest-harmonious-subsequence/)

这里用一个map存储数组中每个元素出现的次数，然后遍历map的keySet（这里建议先对map的key进行排序），找出前后相差为1的key，计算出其对应的value值，返回最大的即可

```text
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs(list.get(i+1) - list.get(i)) == 1) {
                int temp = Math.abs(map.get(list.get(i+1)) + map.get(list.get(i)));
                if (temp > max)
                    max = temp;
            }
        }
        return max;
    }
}   
```