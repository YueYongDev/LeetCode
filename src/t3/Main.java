package t3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.clear();
            list.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!isContains(list, s.charAt(j))) {
                    list.add(s.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > max)
                max = list.size();
            print(list);
            System.out.println();
        }
        return max;
    }

    //打印输出
    public void print(List<Character> list) {
        for (char c : list) {
            System.out.print(c + " ");
        }
    }

    //判断内容是否存在list中
    public boolean isContains(List<Character> list, char x) {
        if (list.contains(x)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        String s = "u";
        System.out.println(main.lengthOfLongestSubstring(s));
    }
}
