package t71;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    public String simplifyPath(String path) {
        if (path.length() == 0) {
            return path;
        }
        Stack<String> stack = new Stack<>();
        String[] ss = path.split("/");
        for (String s : ss) {
            if (s.length() == 0 || ".".equals(s)) {
                continue;
            } else if ("..".equals(s)) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        if (sb.length() == 0) {
            sb.append("/");
        }
        return sb.toString();
    }
}
