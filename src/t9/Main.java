package t9;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String s = x + "";
        String reverseString = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == reverseString.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
