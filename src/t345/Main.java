package t345;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverseVowels("aA"));
    }

    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == 'a' || ss[i] == 'e' || ss[i] == 'i' || ss[i] == 'o' || ss[i] == 'u' || ss[i] == 'A' || ss[i] == 'E' || ss[i] == 'I' || ss[i] == 'O' || ss[i] == 'U') {
                stringBuilder.append(s.charAt(i));
                indexs.add(i);
            }
        }
        String temp = stringBuilder.reverse().toString();
        for (int i = 0; i < indexs.size(); i++) {
            ss[indexs.get(i)] = temp.charAt(i);
        }
        return new String(ss);
    }
}
