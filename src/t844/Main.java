package t844;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.backspaceCompare("ab#c", "ad#c"));
    }

    public boolean backspaceCompare(String S, String T) {
        return newString(S).equals(newString(T));
    }

    private String newString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#')
                stack.push(c);
            else {
                if (!stack.isEmpty())
                    stack.pop();
            }
        }
        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }

//    public String newString(String s) {
//        List<Character> characters = new ArrayList<>();
//        for (char c : s.toCharArray()) {
//            characters.add(c);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        int i = 0;
//        while (i < characters.size()) {
//            if (characters.get(i) == '#') {
//                if (i - 1 >= 0) {
//                    characters.remove(i - 1);
//                    i--;
//                }
//                characters.remove(i);
//
//            } else {
//                i++;
//            }
//        }
//
//        for (char c : characters) {
//            sb.append(c);
//        }
//
//        return sb.toString();
//    }
}
