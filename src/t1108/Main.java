package t1108;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(new Main().defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
