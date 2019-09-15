package t1071;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 好比两段绳子不断互相比较，最后剩下来的就是要的那个
     *
     * @param str1
     * @param str2
     * @return
     */
    public String gcdOfStrings(String str1, String str2) {
        while (str1.length() > 0 && str2.length() > 0) {
            if (str1.length() > str2.length()) {
                String temp = str1;
                str1 = str2;
                str2 = temp;
            }
            if (str2.indexOf(str1) < 0) {
                return "";
            } else {
                str2 = str2.substring(str2.indexOf(str1) + str1.length());
            }
        }
        if (str1.length() == 0) {
            return str2;
        } else if (str2.length() == 0) {
            return str1;
        } else {
            return "";
        }
    }
}
