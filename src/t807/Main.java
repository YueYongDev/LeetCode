package t807;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{59, 88, 44}, {3, 18, 38}, {21, 26, 51}};
        int res = new Main().maxIncreaseKeepingSkyline(grid);
        System.out.println(res);
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null || grid.length < 1 || grid[0] == null || grid[0].length < 1) {
            return 0;
        }

        int ans = 0;

        // 垂直天际线，行
        int[] maxRow = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            maxRow[i] = maxRow(grid, i);
        }

        // 水平天际线，列
        int[] maxColumn = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            maxColumn[i] = maxCol(grid, i);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans += Math.min(maxRow[i], maxColumn[j]) - grid[i][j];
            }
        }

        return ans;
    }

    /**
     * 获取某一行的最大值
     */
    private int maxRow(int[][] grid, int row) {
        int max = 0;

        for (int i = 0; i < grid[row].length; i++) {
            if (max < grid[row][i]) {
                max = grid[row][i];
            }
        }

        return max;
    }

    /**
     * 获取某一列的最大值
     */
    private int maxCol(int[][] grid, int col) {
        int max = 0;

        for (int[] ints : grid) {
            if (max < ints[col]) {
                max = ints[col];
            }
        }

        return max;
    }
}
