package t151;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
