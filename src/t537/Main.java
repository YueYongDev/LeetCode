package t537;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.complexNumberMultiply("1+1i", "1+1i"));
    }

    public String complexNumberMultiply(String a, String b) {
        String[] as = a.split("\\+");
        String[] bs = b.split("\\+");
        int A = Integer.parseInt(as[0]);
        int B = Integer.parseInt(as[1].replace("i", ""));
        int C = Integer.parseInt(bs[0]);
        int D = Integer.parseInt(bs[1].replace("i", ""));
        int left = A * C - B * D ;
        int right = A * D + B * C ;
        return left + "+" + right + "i";
    }
}
