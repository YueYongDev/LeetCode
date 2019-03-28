package t744;

/**
 * https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        char[] cs = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(main.nextGreatestLetter(cs, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] > target)
                return letters[i];
        }
        if (letters[letters.length - 1] <= target)
            return letters[0];
        else
            return letters[letters.length - 1];
    }
}
