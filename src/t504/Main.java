package t504;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().convertToBase7(-7));
    }

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}
