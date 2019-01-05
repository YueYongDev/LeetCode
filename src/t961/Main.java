package t961;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {5,1,5,2,5,3,5,4};
        System.out.println(main.repeatedNTimes(a));
    }

    public int repeatedNTimes(int[] A) {
//        //算法1 运行时间28ms
//        Arrays.sort(A);
//        int sum = 1;
//        for (int i = 0; i < A.length-1; i++) {
//            if (A[i] == A[i + 1]) {
//                sum++;
//            } else {
//                if (sum == A.length / 2) {
//                    return A[i];
//                } else
//                    sum = 1;
//            }
//        }
//        if (sum==A.length/2)
//            return A[A.length-1];
//        return 0;

        //算法2 运行时间16ms
        int[] countArr=new int[10000];
        for (int i:A){
            countArr[i]++;
            if (countArr[i]==A.length/2)
                return i;
        }
        return 0;
    }
}
