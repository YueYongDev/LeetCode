package t322;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.addStrings("12592", "445"));
    }

    public String addStrings(String num1, String num2) {

        List<Integer> number1 = new ArrayList<>();
        List<Integer> number2 = new ArrayList<>();

        int len = Math.max(num1.length(), num2.length());

        Integer[] data = new Integer[len + 1];
        Arrays.fill(data, 0);
        List<Integer> result = Arrays.asList(data);

        for (int i = 0; i < num1.length(); i++) {
            number1.add(num1.charAt(i) - '0');
        }

        for (int i = 0; i < num2.length(); i++) {
            number2.add(num2.charAt(i) - '0');
        }

        Collections.reverse(number1);
        Collections.reverse(number2);

        for (int i = number1.size(); i < len; i++) {
            number1.add(0);
        }
        for (int i = number2.size(); i < len; i++) {
            number2.add(0);
        }

        for (int i = 0; i < len; i++) {
            int temp = number1.get(i) + number2.get(i) + result.get(i);
            if (temp < 10)
                result.set(i, temp);
            else {
                result.set(i, temp - 10);
                result.set(i + 1, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = len; i >= 0; i--) {
            sb.append(result.get(i));
        }
        if (sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
