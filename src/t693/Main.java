package t693;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.hasAlternatingBits(10));
    }

    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        char[] cs=s.toCharArray();
        for(int i=0;i<cs.length-1;i++){
            if (cs[i]==cs[i+1])
                return false;
        }
        return true;
    }
}
