package t367;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
        for (int i = 1; num > 0; i += 2) {
            num -= i;
        }
        return num == 0;
    }
}
