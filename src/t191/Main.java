package t191;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().hammingWeight(128));
    }

    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

}
