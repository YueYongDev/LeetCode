package t213;

public class Main {
    public static void main(String[] args) {

    }

    public int cycleRob(int[] nums, int low, int high) {
        int norob = nums[low];  //表示不抢第i+1家的量，初始化即为不抢第2家，即抢第1家
        int rob = nums[low + 1];    //表示抢第i+1家的量，初始化即为抢第2家
        for (int i = low + 2; i <= high; i++) {
            int temp = norob;                 //因为i已经++了，所以此时的temp表示的是不抢第i家的量
            norob = Math.max(norob, rob);      //不抢第i+1家的量为抢或者不抢第i家的量的最大值
            rob = nums[i] + temp;               //抢第i+1家的量为第i+1家的量加上不抢第i家的量的和
        }
        return Math.max(norob, rob);
    }

    public int rob(int[] nums) {
        int result = 0;
        switch (nums.length) {
            case 0:
                break;
            case 1:
                result = nums[0];
                break;
            case 2:
                result = Math.max(nums[0], nums[1]);
                break;
            default:
                int temp1 = cycleRob(nums, 0, nums.length - 2);
                int temp2 = cycleRob(nums, 1, nums.length - 1);
                result = Math.max(temp1, temp2);
                break;
        }
        return result;
    }
}
