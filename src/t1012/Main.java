package t1012;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.bitwiseComplement(10));
    }

    public int bitwiseComplement(int N) {
        String s = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                sb.append(1);
            else if (s.charAt(i) == '1')
                sb.append(0);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

}
