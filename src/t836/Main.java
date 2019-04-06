package t836;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] rec1 = {-869208301, 14313684, -395772186, 962312876};
        int[] rec2 = {-205964777, -604232538, -72710445, -523799434};
        System.out.println(main.isRectangleOverlap(rec1, rec2));

    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[0] >= rec2[2] || rec1[2] <= rec2[0] || rec1[1] >= rec2[3] || rec1[3] <= rec2[1]);
    }
}
