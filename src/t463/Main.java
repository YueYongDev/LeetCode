package t463;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] a = {{0, 1, 0, 0},
                {0, 1, 1, 1},
                {0, 1, 1, 0},
                {0, 0, 1, 0}};
        System.out.println(main.islandPerimeter(a));
    }

    public int islandPerimeter(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int around = around(grid, i, j);
                    map.put(around, map.get(around) + 1);
                }
            }
        }
        return map.get(0) * 4 + map.get(1) * 3 + map.get(2) * 2 + map.get(3);
    }

    public int around(int[][] grid, int i, int j) {
        int x = grid[0].length;     //二维数组的宽
        int y = grid.length;        //二维数组的长
        int count = 0;
        try {
            if (grid[i][j - 1] == 1)
                count++;
        } catch (Exception e) {
            count = count;
        }
        try {
            if (grid[i][j + 1] == 1)
                count++;
        } catch (Exception e) {
            count = count;
        }
        try {
            if (grid[i - 1][j] == 1)
                count++;
        } catch (Exception e) {
            count = count;
        }

        try {
            if (grid[i + 1][j] == 1)
                count++;
        } catch (Exception e) {
            count = count;
        }
        return count;
    }
}
