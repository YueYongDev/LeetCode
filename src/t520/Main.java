package t520;

public class Main {
    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {
        if (word == null || word == "") return false;

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A')
                count++;
        }

        if (count == word.length() || (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') || count == 0)
            return true;
        return false;

    }

}
