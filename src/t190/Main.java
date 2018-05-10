package t190;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().reverseBits(1));
    }

//    public int reverseBits(int n) {
//        String s = Integer.toBinaryString(n);
//        StringBuilder sb = new StringBuilder(s).reverse();
//        if (sb.length() < 32) {
//            for (int i = sb.length(); i < 32; i++) {
//                sb.append("0");
//            }
//        }
//        String rs = sb.toString();
//        return Integer.parseInt(rs, 2);
//    }

    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            if ((n & 1) == 1)
                ans++;
            n >>= 1;
        }
        return ans;
    }
}
