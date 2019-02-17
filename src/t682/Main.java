package t682;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String[] ss = {"5","-2","4","C","D","9","+","+"};
        System.out.println(main.calPoints(ss));
    }

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String s : ops) {
            switch (s) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int pre = stack.pop();
                    int prepre = stack.peek();
                    stack.push(pre);
                    stack.push(pre + prepre);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;
            }
        }
        int len = stack.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += stack.pop();
        }
        return sum;
    }
}
