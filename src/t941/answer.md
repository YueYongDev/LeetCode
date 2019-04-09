[941. 有效的山脉数组](https://leetcode-cn.com/problems/valid-mountain-array/)

山脉数组就是前期是递增序列，后期是递减序列的数组

所以刚开始可以设置两个标志符，分别表示上升和下降

如果在上升序列时发现down是true，那么就返回false，同理，如果是下降序列时发现up是true，也return false，最后取二者交集即可

```text
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {0, 3, 2, 1};
        System.out.println(main.validMountainArray(a));
    }

    public boolean validMountainArray(int[] A) {
        boolean up = false;
        boolean down = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] - A[i + 1] < 0) {
                if (down) return false;
                up = true;
            } else if (A[i] - A[i + 1] > 0) {
                if (!up) return false;
                down = true;
            } else {
                return false;
            }
        }
        return up && down;
    }
}
```