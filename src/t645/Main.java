package t645;

/**
 * https://leetcode-cn.com/problems/set-mismatch/
 */
public class Main {

    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        int[] numMap = new int[nums.length+1];
        for (int x : nums) {
            numMap[x]++;
        }
        int[] res = new int[2];
        for (int i = 1; i < numMap.length; i++) {
            if (numMap[i] == 0)
                res[1] = i;
            if (numMap[i] == 2)
                res[0] = i;
        }
        return res;
    }
}
