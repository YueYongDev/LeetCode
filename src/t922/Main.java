package t922;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        int[] A={4,2,5,7};
        int[] x=main.sortArrayByParityII(A);
        for (int y:x){
            System.out.println(y);
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (int x:A){
            if (x%2==0)
                list1.add(x);
            else list2.add(x);
        }
        int[] B=new int[list1.size()+list2.size()];
        for (int i=0;i<B.length;i++){
            if (i%2==0)
                B[i]=list1.get(i/2);
            else B[i]=list2.get(i/2);
        }
        return B;
    }
}
