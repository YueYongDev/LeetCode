[59. 螺旋矩阵 II](https://leetcode-cn.com/problems/spiral-matrix-ii/)

按照题目要求模拟构造矩阵即可，大致思路如下：

1. 从左到右填充一行
2. 从上到下填充一列
3. 从右到左填充一行，注意只有一行的情况
4. 从下到上填充一列，注意只有一列的情况

```text
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int n = 4;
        int[][] matrix = main.generateMatrix(n);
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int row_start = 0;
        int row_end = n - 1;
        int column_start = 0;
        int column_end = n - 1;
        int num = 1;
        while (row_start <= row_end && column_start <= column_end) {
            for (int i = column_start; i <= column_end; i++) {
                res[row_start][i] = num;
                num++;
            }
            row_start++;
            for (int i = row_start; i <= row_end; i++) {
                res[i][column_end] = num;
                num++;
            }
            column_end--;
            for (int i = column_end; i >= column_start; i--) {
                res[row_end][i] = num;
                num++;
            }
            row_end--;
            for (int i = row_end; i >= row_start; i--) {
                res[i][column_start] = num;
                num++;
            }
            column_start++;
        }
        return res;
    }
}

```