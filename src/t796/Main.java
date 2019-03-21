package t796;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.rotateString("abcde", "cdeab"));
    }

    public boolean rotateString(String A, String B) {
        if (A.equals(B)) return true;
        if (A.length() != B.length()) return false;
        A = A + A;
        return A.contains(B);
    }

//    public boolean rotateString(String A, String B) {
//        if (A.equals(B)) return true;
//        if (A.length() != B.length()) return false;
//        String temp = A;
//        for (int i = 0; i < A.length(); i++) {
//            temp = newString(temp);
//            if (temp.equals(B))
//                return true;
//
//        }
//        return false;
//    }
//
//    public String newString(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        sb.append(s.charAt(0));
//        sb.deleteCharAt(0);
//        return sb.toString();
//    }
}
