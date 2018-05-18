package t8;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.myAtoi("3.1415"));
    }

    public int myAtoi(String str) {
        String s = str.trim();
        if (s.equals("")) return 0;
        char head = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        if (head == '-' || head == '+') {
            sb.append(head);
            if (s.length() > 1) {
                for (int i = 1; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c >= 48 && c <= 57) {
                        sb.append(c);
                    } else
                        break;
                }
            } else {
                return 0;
            }
        } else if (head >= 48 && head <= 57) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 48 && c <= 57) {
                    sb.append(c);
                } else
                    break;
            }
        } else {
            return 0;
        }

        if (sb.length() == 1) {
            if (sb.charAt(0) >= 48 && sb.charAt(0) <= 57) {

            } else
                return 0;
        } else if (sb.length() > 1) {
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) >= 48 && sb.charAt(i) <= 57) {

                } else
                    return 0;
            }
        } else
            return 0;

        int x;
        try {
            x = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (head == '-') {
                x = Integer.MIN_VALUE;
            } else {
                x = Integer.MAX_VALUE;
            }
        }
        return x;
    }
}
