package t17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        helper("", 0, digits, res, map);
        return res;

    }

    private void helper(String cur, int curIndex, String digits, List<String> res, Map<Character, String> map) {
        if (curIndex == digits.length()) {
            res.add(cur);
        } else {
            // 表示处理到某一个数字了
            char c = digits.charAt(curIndex);
            if (map.containsKey(c)) {
                for (char ch : map.get(c).toCharArray()) {
                    helper(cur + ch, curIndex + 1, digits, res, map);
                }
            }
        }
    }

}
