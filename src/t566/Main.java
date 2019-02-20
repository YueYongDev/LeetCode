package t566;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || nums.length * nums[0].length != r * c) {
            return nums;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.offer(nums[i][j]);
            }
        }

        int res[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.poll();
            }
        }
        return res;
    }
}
