package t350;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        int[] c = main.intersect(a, b);
        for (int x : c) {
            System.out.println(x);
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            num1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (num1.contains(nums2[i])) {
                res.add(nums2[i]);
                num1.remove((Object) nums2[i]);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
