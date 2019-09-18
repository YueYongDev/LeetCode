package t1003;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isValid("aaabcbcbc"));
    }

    public boolean isValid(String S) {
        String[] str = S.split("abc");
        while (str.length > 1) {
            StringBuilder tmp = new StringBuilder();
            for (String aStr : str) {
                tmp.append(aStr);
            }
            str = tmp.toString().split("abc");
        }
        return str.length == 0;
    }

//    public boolean isValid(String S) {
//        while (S.length() > 0 && S.contains("abc"))
//            S = S.replace("abc", "");
//        return  S.equals("") ;
//    }
}
