package t856;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 在之前刷题中发现，如果有递归的写法，可以通过栈改写成循环的写法，
     * 遍历字符串S，遇到(就入栈，当前分数压入栈中，把已得的分数清空，
     * 如果遇到)说明已经形成一个完整的括号字符串，去掉外层括号，内层的
     * 已经算出来了res，然后res*2和1作比较取最大值,最后加上栈顶的值,
     * 因为栈顶的值是之前合法括号子串的值。
     */
    public int scoreOfParentheses(String S) {
        if (S.length() == 0) {
            return 0;
        }
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(res);
                res = 0; //当前分数清空
            } else {
                res = stack.peek() + Math.max(res * 2, 1);
                stack.pop();
            }
        }
        return res;
    }
}
