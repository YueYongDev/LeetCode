地址：[t661 图片平滑器](https://leetcode-cn.com/problems/image-smoother/)

本题类似于深度学习中卷积神经网络的平均池化操作，本人采用的是暴力遍历的方法，先用8个变量表示其周围8个角，然后依次判断i，j和row和column之间的关系，如果合理，则参与计算并放到一个新的二维数组中，如此反复，最后返回该二维数组，代码如下：
```java
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] M = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] res = main.imageSmoother(M);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                res[i][j] = sum(M, i, j);
            }
        }
        return res;
    }

    public int sum(int[][] M, int i, int j) {
        int row = M.length;
        int column = M[0].length;
        int count = 1;
        int left_up = 0;
        int left = 0;
        int left_down = 0;
        int up = 0;
        int down = 0;
        int right_up = 0;
        int right = 0;
        int right_down = 0;
        if (i - 1 >= 0) {
            up = M[i - 1][j];
            count++;
            if (j - 1 >= 0) {
                left_up = M[i - 1][j - 1];
                count++;
            }
            if (j + 1 < column) {
                right_up = M[i - 1][j + 1];
                count++;
            }
        }
        if (i + 1 < row) {
            down = M[i + 1][j];
            count++;
            if (j - 1 >= 0) {
                left_down = M[i + 1][j - 1];
                count++;
            }
            if (j + 1 < column) {
                right_down = M[i + 1][j + 1];
                count++;
            }
        }
        if (j - 1 >= 0) {
            left = M[i][j - 1];
            count++;
        }
        if (j + 1 < column) {
            right = M[i][j + 1];
            count++;
        }
        int sum = left + left_down + left_up + right + right_down + right_up + up + down + M[i][j];
        return sum / count;
    }
}
```