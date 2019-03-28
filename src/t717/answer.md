[717. 1比特与2比特字符](https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/)

由于10， 11两个编码都是以1开头的，这意味着只要是以1开头的后面一个数必定是根这个1一起的字符编码。利用这一点：

用一个指针从前向后走，遇到1就走两步，遇到0就走一步，看最后是不是走到n-1的位置，说明最后的0只能是单独存在的，否则走到n的位置就说明这个0是跟前面的1一起的。

```java
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
            int i = 0;
            for (i = 0; i < bits.length - 1; ) {
                if (bits[i] == 0) {
                    i++;
                } else
                    i += 2;
            }
            System.out.println(i);
            return i == bits.length - 1;
        }
}
```