package t349;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();    //HashSet不允许出现重复的元素
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums2) {
            set1.add(x);
        }

        for (int x : nums1) {
            if (set1.contains(x)) {
                set2.add(x);
            }
        }
        int[] res = new int[set2.size()];
        Iterator iterator = set2.iterator();

        for (int i = 0; i < set2.size(); i++) {
            res[i] = (int) iterator.next();
        }
        return res;
    }
}
