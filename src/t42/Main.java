package t42;

public class Main {
    public static void main(String[] args) {

    }

    public int trap(int[] height) {
        int max = 0;
        int maxIndex = 0;
        //寻找A点
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }
        int maxLeft = 0;
        int result = 0;
        //计算left-A的雨水收集
        for (int i = 0; i < maxIndex; i++) {
            if (height[i] > maxLeft) {
                maxLeft = height[i];
            } else {
                result += maxLeft - height[i];
            }
        }
        int maxRight = 0;
        //计算A-left的雨水收集
        for (int i = height.length - 1; i > maxIndex; i--) {
            if (height[i] > maxRight) {
                maxRight = height[i];
            } else {
                result += maxRight - height[i];
            }
        }
        return result;
    }
}
