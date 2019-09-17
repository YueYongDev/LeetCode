package t647;

public class Main {
    public static void main(String[] args) {

    }

    public int countSubstrings(String s) {
        int count = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                boolean equals = true;
                int ni = i, nj = j;
                while (ni <= nj) {
                    if (s.charAt(ni++) != s.charAt(nj--)) {
                        equals = false;
                        break;
                    }
                }
                if (equals) {
                    count++;
                }
            }
        }
        return count;
    }
}
