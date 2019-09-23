package t848;

public class Main {
    public static void main(String[] args) {

    }

    public String shiftingLetters(String S, int[] shifts) {
        char[] chars = S.toCharArray();
        for (int i = shifts.length - 2; i >= 0; i--) {
            //防止超过int最大值
            shifts[i] += shifts[i + 1] % 26;
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((chars[i] - 'a' + shifts[i]) % 26 + 'a');
        }
        return String.valueOf(chars);
    }

}
