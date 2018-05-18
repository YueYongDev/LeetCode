package t6;

public class Main {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int nodeLen = 2 * numRows - 2;//两整列之间的差 也就是等差数列中的d

        if (s.length() == 0 || numRows == 0 || numRows == 1)//特殊情况特殊处理
            return s;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += nodeLen) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && j - 2 * i + nodeLen < s.length()) {
                    sb.append(s.charAt(j - 2 * i + nodeLen));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.convert("A", 1));
    }
}
