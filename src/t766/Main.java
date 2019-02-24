package t766;

/**
 * https://leetcode-cn.com/problems/toeplitz-matrix/
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] a = {{11, 74, 0, 93}, {40, 11, 74, 7}};
        System.out.println(main.isToeplitzMatrix(a));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int a = i + 1;
                int b = j + 1;
                if (a >= matrix.length || b >= matrix[0].length) break;
                if (matrix[i][j] != matrix[a][b]) return false;
            }
        }
        return true;
    }
}
