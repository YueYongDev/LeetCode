package t383;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.canConstruct("a", "b"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;
        char[] cs1 = ransomNote.toCharArray();
        char[] cs2 = magazine.toCharArray();
        for (int i = 0; i < cs1.length; i++) {
            for (int j = 0; j < cs2.length; j++) {
                if (cs1[i] == cs2[j]) {
                    cs1[i] = '0';
                    cs2[j] = '0';
                    break;
                }
            }
        }
        for (char x : cs1) {
            if (x != '0')
                return false;
        }

        return true;
    }
}
