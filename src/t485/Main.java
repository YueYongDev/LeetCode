package t485;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1,1,1};
        System.out.println(main.findMaxConsecutiveOnes(a));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (max < count)
                    max = count;
            } else {
                count = 0;
            }
        }
        return max;
    }
}
