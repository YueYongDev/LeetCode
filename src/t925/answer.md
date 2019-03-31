[925. 长按键入](https://leetcode-cn.com/problems/long-pressed-name/)

双指针遍历，指针i用于遍历name，指针j用于遍历typed，从0开始进行计算，如果`name[i]==typed[j]`，则游标后移一位，即`i++，j++`；如果不等，就看看i是不是0，如果是0直接false，如果不是0，就看`typed[j]`和`name[i-1]`是否一致（如果一致，则说明typed多了一位），最后返回结果即可

```java
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isLongPressedName("kikcxmvzi", "kiikcxxmmvvzz"));
    }

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        for (int j = 0; i < name.length() && j < typed.length(); j++) {
            if (name.charAt(i) == typed.charAt(j))
                i++;
            else if (i == 0 || name.charAt(i - 1) != typed.charAt(j))
                return false;
        }
        return i == name.length();
    }
}
```