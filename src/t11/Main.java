package t11;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 1};
        Main main = new Main();
        System.out.println(main.maxArea(a));
    }

//    //暴力破解
//    public int maxArea(int[] height) {
//        int max = 0;
//        int result = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                result = Math.min(height[i], height[j]) * (Math.abs(i - j));
//                if (result > max)
//                    max = result;
//            }
//        }
//        return max;
//    }

    //贪心算法
    public int maxArea(int[] height) {
        // 参数校验
        if (height == null || height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                int k = left;
                while (k < right && height[k] <= height[left]) {
                    k++;
                }
                left = k;
            } else {
                int k = right;
                while (k > left && height[k] <= height[right]) {
                    k--;
                }
                right = k;
            }
        }
        return max;

    }
}
