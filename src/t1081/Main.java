package t1081;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.smallestSubsequence("ecbacba"));
    }

    /**
     * 使用栈存储结果数据，如果当前遍历的元素小于栈顶元素并且栈顶元素在后面的字符串中还存在则弹出，循环此情况。
     *
     * @param text
     * @return
     */
    public String smallestSubsequence(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            /**
             * 1. 栈不为空
             * 2. 栈顶元素大于当前元素
             * 3. 栈顶元素并不是最后一次出现
             */
            while (!stack.isEmpty() && stack.peek() > c && text.lastIndexOf(stack.peek()) > i) {
                stack.pop();
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
