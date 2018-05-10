package t88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new Main().merge(nums1, 3, nums2, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m;
        for (int i = 0; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }

        Arrays.sort(nums1);
    }
}
