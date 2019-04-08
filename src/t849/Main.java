package t849;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1, 0, 0, 0, 1, 0, 1};
        System.out.println(main.maxDistToClosest(a));
    }

    public int maxDistToClosest(int[] seats) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1)
                list.add(i);
        }
        int start = list.get(0);
        int end = seats.length - list.get(list.size() - 1) - 1;
        int max = Math.max(start, end);

        for (int i = 0; i < list.size() - 1; i++) {
            int temp = (list.get(i + 1) - list.get(i)) / 2;
            if (temp > max) max = temp;
        }

        return max;
    }
}
