[744. 寻找比目标字母大的最小字母](https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/)

感觉本题没啥好说的，遍历一遍即可
```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] > target)
                return letters[i];
        }
        if (letters[letters.length - 1] <= target)
            return letters[0];
        else
            return letters[letters.length - 1];
    }
}
```