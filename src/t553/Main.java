package t553;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] ss = {1000, 100, 10, 2};
        System.out.println(main.optimalDivision(ss));
    }

    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return nums[0] + "";
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            sb.append("/");
            if (i == 1) {
                sb.append("(");
            }
            sb.append(nums[i]);

        }
        sb.append(")");
        return sb.toString();
    }
}
