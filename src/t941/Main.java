package t941;

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
