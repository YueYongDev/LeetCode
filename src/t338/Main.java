package t338;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = main.countBits(5);
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr;
    }

    //        for (int i = 0; i <= num; i++) {
//            arr[i] = count(i);
//        }
    public int count(int num) {
        int count = 0;
        String s = Integer.toBinaryString(num);
        for (char c : s.toCharArray())
            if (c == '1')
                count++;
        return count;
    }
}
