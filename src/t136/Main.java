package t136;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        List<Num> numList = new ArrayList<>();
        for (int i : nums) {
            Num num = new Num();
            num.setVal(i);
            num.setCount(0);
            numList.add(num);
        }

        for (Num num : numList) {
            for (int i : nums) {
                if (num.getVal() == i) {
                    int x = num.getCount();
                    num.setCount(++x);
                }
            }
        }

        for (Num num : numList) {
            if (num.getCount() == 1) {
                return num.getVal();
            }
        }
        return 0;
    }

    class Num {
        int val;
        int count;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
