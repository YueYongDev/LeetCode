package t4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(new Main().findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        int size = list.size();
        int left = (list.size() / 2) - 1;
        if (size % 2 == 0) {
            int sum = list.get(size / 2) + list.get(left);
            return sum / 2.0;
        } else {
            return list.get(size / 2);
        }
    }
}
