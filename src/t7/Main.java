package t7;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        String s = x + "";
        String s1 = "";
        String reverseString = "";
        try {
            if (s.charAt(0) == '-') {
                s1 = s.substring(1, s.length());
                reverseString = new StringBuilder(s1).reverse().toString();
                return Integer.parseInt("-" + reverseString);
            } else {
                s1 = s;
                reverseString = new StringBuilder(s1).reverse().toString();
                return Integer.parseInt("" + reverseString);
            }
        }catch (NumberFormatException e){
            return 0;
        }

    }
}
