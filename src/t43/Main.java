package t43;

public class Main {
    public static void main(String[] args) {

    }

    public String multiply(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int posLow = i + j + 1;
                int posHigh = i + j;
                mul += result[posLow];
                result[posLow] = mul % 10;
                result[posHigh] += mul / 10;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int res : result) {
            if (!(stringBuilder.length() == 0 && res == 0)) {
                stringBuilder.append(res);
            }
        }
        return (stringBuilder.length() == 0) ? "0" : stringBuilder.toString();
    }
}
