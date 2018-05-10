package t53;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Main().maxSubArray(nums));
    }

//    //暴力破解O(N^3)
//    public int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {// 子序列左端点
//            for (int j = i; j < nums.length; j++) {// 子序列右端点
//                int sum = 0;
//                for (int k = i; k <= j; k++) {//暴力计算
//                    sum += nums[k];
//                }
//                if (max < sum) {
//                    max = sum;
//                }
//            }
//        }
//        return max;
//    }

//    //暴力破解改进O(N^2)
//    public int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {// 子序列左端点
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {// 子序列右端点
//                sum += nums[j];//这一步相当于每次根据前一次的序列来计算新的序列和
//                if (max < sum)
//                    max = sum;
//            }
//        }
//        return max;
//    }

    //扫描法

    /**
     * curSum 表示当前执行过程中的和，
     * 如果当前序列执行过程的和小于0，说明再往后加只会减小当前序列和，此时curSum应该转变为nums[i],然后开始计算新的序列和
     */
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (curSum < 0)
                curSum = nums[i];
            else
                curSum += nums[i];
            if (curSum > max)
                max = curSum;
        }
        return max;
    }
}
