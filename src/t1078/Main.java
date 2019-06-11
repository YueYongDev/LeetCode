package t1078;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String text = "we we rock you we", first = "we", second = "will";
        String[] ss = main.findOcurrences(text, first, second);
        for (String s : ss) {
            System.out.println(s);
        }
    }

    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length - 2; i++) {
            if (strings[i].equals(first)) {
                if (strings[i + 1].equals(second)) {
                    list.add(strings[i + 2]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
