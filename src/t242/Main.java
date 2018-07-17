package t242;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i)-97] ++;
            tArray[t.charAt(i)-97] ++;
        }

        for (int i = 0; i < 26; i++)
            if (sArray[i]!=tArray[i])
                return false;

        return true;
    }
}
