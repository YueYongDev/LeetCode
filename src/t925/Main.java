package t925;

/**
 * https://leetcode-cn.com/problems/long-pressed-name/
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isLongPressedName("kikcxmvzi", "kiikcxxmmvvzz"));
    }

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        for (int j = 0; i < name.length() && j < typed.length(); j++) {
            if (name.charAt(i) == typed.charAt(j))
                i++;
            else if (i == 0 || name.charAt(i - 1) != typed.charAt(j))
                return false;
        }
        return i == name.length();
    }
}
