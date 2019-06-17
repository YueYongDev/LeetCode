package t861;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        Main main = new Main();
        System.out.println(main.matrixScore(arr));
    }

    public int matrixScore(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            // 先判断每一行的第一个数是不是1
            boolean change = (A[i][0] == 0);
            for (int j = 0; j < A[0].length; j++) {
                if (change) {
                    // 如果不是1，该行就转换，保证第一位一定是1
                    A[i][j] = 1 - A[i][j];
                }
            }
        }
        for (int j = 1; j < A[0].length; j++) {
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i][j] == 0) {
                    count++;
                }
            }
            // 比较第j列中是0的个数多还是1的个数多
            boolean change = (count > A.length - count);
            if (change) {
                // 如果0的个数多就执行转换
                for (int i = 0; i < A.length; i++) {
                    A[i][j] = 1 - A[i][j];
                }
            }
        }
        int sum = 0;
        for (int[] ints : A) {

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < A[0].length; j++) {
                sb.append(ints[j]);
            }
            sum += Integer.parseInt(sb.toString(), 2);
        }
        return sum;
    }
}
