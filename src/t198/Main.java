package t198;

public class Main {
    public static void main(String[] args) {

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
                int norob=nums[0];  //表示不抢第i+1家的量，初始化即为不抢第2家，即抢第1家
                int rob=nums[1];    //表示抢第i+1家的量，初始化即为抢第2家
                for (int i=2;i<nums.length;i++){
                    int temp=norob;                 //因为i已经++了，所以此时的temp表示的是不抢第i家的量
                    norob=Math.max(norob,rob);      //不抢第i+1家的量为抢或者不抢第i家的量的最大值
                    rob=nums[i]+temp;               //抢第i+1家的量为第i+1家的量加上不抢第i家的量的和
                }
                result=Math.max(norob,rob);
                break;
        }
        return result;
    }
}
