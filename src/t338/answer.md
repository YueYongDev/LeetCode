[338. 比特位计数](https://leetcode-cn.com/problems/counting-bits/)

给出时间复杂度为O(n*sizeof(integer))的解答非常容易，遍历最后的结果即可，代码如下。
```text
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = main.countBits(5);
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            arr[i] = count(i);
        }
        return arr;
    }

    public int count(int num) {
        int count = 0;
        String s = Integer.toBinaryString(num);
        for (char c : s.toCharArray())
            if (c == '1')
                count++;
        return count;
    }
}
```

然而这道题的进阶部分却很有意思：
```
你可以在线性时间O(n)内用一趟扫描做到吗？
```
下面是分析：
对于所有的数字，只有两类：

奇数：二进制表示中，奇数一定比前面那个偶数多一个1，因为多的就是最低位的1.
```text
        举例： 
 0 = 0        1 = 1
 2 = 10      3 = 11
```
          
偶数：二进制表示中，偶数中1的个数一定和除以2之后的那个数一样多。因为最低位是0，除以2就是右移一位，也就是把那个0抹掉而已，所以1的个数是不变的。
``` 
        举例：
2 = 10       4 = 100       8 = 1000
3 = 11       6 = 110       12 = 1100
```
另外，0的1个数为0，于是就可以根据奇偶性开始遍历计算了。
下面是代码：
```text
class Solution {
    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr;
    }
}
```