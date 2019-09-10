package t22;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> generateParenthesis(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> list0 = new ArrayList<>();
        list0.add("");
        result.add(list0);
        List<String> list1 = new ArrayList<>();
        list1.add("()");
        result.add(list1);
        for (int i = 2; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = result.get(j);
                List<String> str2 = result.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String el = "(" + s1 + ")" + s2;
                        temp.add(el);
                    }
                }
            }
            result.add(temp);
        }
        return result.get(n);
    }
}
