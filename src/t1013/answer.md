[1013. 将数组分成和相等的三个部分](https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/)

题目要求分成和相等的三分，所以我们需要先数组的和
```text
public int sumOfArr(int[] A) {
    int sum = 0;
    for (int x : A) {
        sum += x;
    }
    return sum;
}
```

求和之后我们在判断是否可以等分成3份，如果不可以直接返回false，如果可以，进行下一步。

因为要分成三份，我们可以找出首末两份，flag1表示能否找出3等份的第一份，index表示找到的第一份的下标，然后遍历即可，如果找到flag1=true，并记录下index。此时进行第三份的查找，我们需要从后往前找，如果flag1=true，那么从后往前找的边界就是index，找到了返回true，代码如下：
```text
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] A = {18, 12, -18, 18, -19, -1, 10, 10};
        System.out.println(main.canThreePartsEqualSum(A));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = sumOfArr(A);
        if (sum % 3 != 0) return false;

        int temp = 0;
        boolean flag1 = false;
        int index = 0;

        for (int i = 0; i < A.length - 1; i++) {
            temp += A[i];
            if (temp == sum / 3) {
                flag1 = true;
                index = i;
                break;
            }
        }

        boolean flag2 = false;
        temp = 0;
        if (flag1) {
            for (int i = A.length - 1; i > index; i--) {
                temp += A[i];
                if (temp == sum / 3) {
                    flag2 = true;
                    break;
                }
            }
        }


        return flag1 && flag2;
    }

    public int sumOfArr(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        return sum;
    }
}

```