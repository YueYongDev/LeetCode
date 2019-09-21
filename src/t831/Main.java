package t831;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.maskPII("(3906)2 07143 711"));
    }

    public String maskPII(String S) {
        String lows = S.toLowerCase().trim();
        if (lows.contains(" ")) {
            lows = lows.replace(" ", "");
        }
        if (lows.contains("(")) {
            lows = lows.replace("(", "");
        }
        if (lows.contains(")")) {
            lows = lows.replace(")", "");
        }
        if (lows.contains("-")) {
            lows = lows.replace("-", "");
        }
        if (lows.contains("+")) {
            lows = lows.replace("+", "");
        }
        if (lows.contains("@")) {
            String[] ss = lows.split("@");
            char start = ss[0].charAt(0);
            char end = ss[0].charAt(ss[0].length() - 1);
            StringBuilder sb = new StringBuilder();
            sb.append(start);
            sb.append(end);
            while (sb.length() < 7) {
                sb.insert(1, "*");
            }
            return sb.toString() + "@" + ss[1];
        } else {
            String end = lows.substring(lows.length() - 4);
            if (lows.length() == 10) {
                return "***-***-" + end;
            } else if (lows.length() == 12) {
                return "+**-***-***-" + end;
            } else if (lows.length() == 11) {
                return "+*-***-***-" + end;
            } else if (lows.length() == 13) {
                return "+***-***-***-" + end;
            }
        }
        return "";
    }
}
