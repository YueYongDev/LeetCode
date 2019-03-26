package t492;

/**
 * https://leetcode-cn.com/problems/construct-the-rectangle/
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = main.constructRectangle(18);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public int[] constructRectangle(int area) {
        int[] a = new int[2];
        int temp = 1;

        for (int i = 2; i <= Math.sqrt(area); i++) {
            if (area % i == 0)
                temp = area / i;
        }
        a[0] = area / temp;
        a[1] = temp;
        if (a[0] < a[1])
            swap(a);
        return a;
    }

    private void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
