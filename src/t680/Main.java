package t680;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.validPalindrome("aba"));
    }

    /**
     * 双指针法
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return helper(s, l + 1, r) || helper(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean helper(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

//    /**
//     * 暴力——超出时间限制
//     * @param s
//     * @return
//     */
//    public boolean validPalindrome(String s) {
//        if (helper(s)) {
//            return true;
//        } else {
//            for (int i = 0; i < s.length(); i++) {
//                StringBuilder sb = new StringBuilder(s);
//                String temp = sb.deleteCharAt(i).toString();
//                if (helper(temp)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private boolean helper(String s) {
//        return s.equals(new StringBuilder(s).reverse().toString());
//    }
}
