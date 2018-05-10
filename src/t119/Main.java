package t119;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lists = new Main().getRow(0);
        for (int x : lists) {
            System.out.print(x + " ");
        }

    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<List<Integer>> aList = new ArrayList<>();
        List<Integer> x1 = new ArrayList<>();
        x1.add(1);
        aList.add(x1);

        if (numRows != 1) {
            for (int i = 1; i < numRows; i++) {
                List<Integer> bList = new ArrayList<>();
                bList.add(1);
                for (int j = 1; j < i; j++) {
                    bList.add(aList.get(i - 1).get(j - 1) + aList.get(i - 1).get(j));
                }
                bList.add(1);
                aList.add(bList);
            }
        }

        return aList;
    }

    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex+1).get(rowIndex);
    }
}
