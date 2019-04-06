[441. 排列硬币](https://leetcode-cn.com/problems/arranging-coins/)

数学公式直接带入求解

```text
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }
}
```