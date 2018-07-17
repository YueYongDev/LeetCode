package t263;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isUgly(8));
    }

    public boolean isUgly(int num) {

        if (num == 1) return true;
        if (num == 0) return false;

        while (num % 2 == 0) {
            num = num / 2;
        }

        while (num % 3 == 0) {
            num = num / 3;
        }

        while (num % 5 == 0) {
            num = num / 5;
        }

        if (num == 1)
            return true;
        else
            return false;
    }
}
