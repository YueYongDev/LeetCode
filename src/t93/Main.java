package t93;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * IP 地址格式：
     * 1. 每位必须是0-255
     * 2。 每位开头不能是0
     *
     * @param s
     * @return
     */
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < i + 4; j++) {
                for (int k = j + 1; k < j + 4; k++) {
                    if (i < n && j < n && k < n) {
                        String temp1 = s.substring(0, i + 1);
                        String temp2 = s.substring(i + 1, j + 1);
                        String temp3 = s.substring(j + 1, k + 1);
                        String temp4 = s.substring(k + 1);
                        if (helper(temp1) && helper(temp2) && helper(temp3) && helper(temp4)) {
                            list.add(temp1 + "." + temp2 + "." + temp3 + "." + temp4);
                        }
                    }
                }
            }
        }
        return list;
    }

    private boolean helper(String temp) {
        return temp != null && temp.length() != 0 && temp.length() <= 3 && (temp.charAt(0) != '0' || temp.length() <= 1) && Integer.parseInt(temp) <= 255;
    }
}
