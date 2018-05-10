package t20;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c != '(' && c != ')' && c != '[' && c != ']' && c != '{' && c != '}') {
                return false;
            }
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if (stack.peek() != '(')
                        return false;
                    else
                        stack.pop();
                } else if (c == ']') {
                    if (stack.peek() != '[')
                        return false;
                    else
                        stack.pop();
                } else {
                    if (stack.peek() != '{')
                        return false;
                    else
                        stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
