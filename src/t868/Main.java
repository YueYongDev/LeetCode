package t868;

/**
 * https://leetcode-cn.com/problems/binary-gap/
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.binaryGap(8));
    }

    public int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
        int max = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == '1') {
                int temp = 0;
                for (int j = i + 1; j < s.length(); j++) {
                    temp++;
                    if (s.charAt(j) == '1') {
                        if (temp > max)
                            max = temp;
                        i = j;
                        break;
                    }
                    i++;
                }
            }
        }

        return max;
    }
}
