## [796. 旋转字符串](https:leetcode-cn.com/problems/rotate-string/)

### 解法一（常规解法）

构造一个temp，然后每次在最后添加一个元素，然后删除首位元素，最后一比较即可
```java
package t796;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.rotateString("abcde", "cdeab"));
    }

    public boolean rotateString(String A, String B) {
        if (A.equals(B)) return true;
        if (A.length() != B.length()) return false;
        String temp = A;
        for (int i = 0; i < A.length(); i++) {
            temp = newString(temp);
            if (temp.equals(B))
                return true;

        }
        return false;
    }

    public String newString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(s.charAt(0));
        sb.deleteCharAt(0);
        return sb.toString();
    }
}

```

### 解法二（流氓解法）
将A首尾相连，然后看新构造出的字符串是否包含B即可

```java
package t796;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.rotateString("abcde", "cdeab"));
    }

    public boolean rotateString(String A, String B) {
        if (A.equals(B)) return true;
        if (A.length() != B.length()) return false;
        A = A + A;
        return A.contains(B);
    }
}

```