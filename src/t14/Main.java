package t14;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"c", ""};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {

            int index = 0;
            int min = 10000000;
            int end = strs[0].length();

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < min) {
                    index = i;
                    min = strs[i].length();
                }
            }

            try {
                for (int i = 0; i < strs.length; i++) {
                    for (int j = 0; j < strs[index].length(); j++) {
                        if (strs[i].charAt(j) != strs[index].charAt(j)) {
                            if (j < end) {
                                end = j;
                            }
                            break;
                        }
                    }
                }
                return strs[index].substring(0, end);
            } catch (Exception e) {
                return "";
            }

    }
}
