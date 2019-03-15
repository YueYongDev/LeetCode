package t551;

/**
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.checkRecord("PPALLPPPAPLLPLLLA"));
    }

    public boolean checkRecord(String s) {
        if (s.indexOf('A') != s.lastIndexOf('A')) {
            return false;
        }

        if (s.contains("LLL")) {
            return false;
        }

        return true;
    }
}
