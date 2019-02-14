package t973;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/problems/k-closest-points-to-origin/
 */

public class Main {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        Main main = new Main();
        main.kClosest(points, 1);

    }

    public int[][] kClosest(int[][] points, int K) {
        TreeMap<Integer, int[]> map = new TreeMap<>();
        int[][] result = new int[K][];
        for (int[] x : points) {
            int res = 0;
            for (int xx : x)
                res = res + (xx * xx);
            map.put(res, x);
        }
        int i=0;
        Iterator titer = map.entrySet().iterator();
        while (titer.hasNext()&&i<K) {
            Map.Entry ent = (Map.Entry) titer.next();
            int[] valuet = (int[]) ent.getValue();
            result[i]=valuet;
            i++;
        }
        return result;
    }
}
