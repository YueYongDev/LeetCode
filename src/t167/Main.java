package t167;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 3;
        Main main = new Main();
        int[] x = main.twoSum(a, target);
        for (int c : x) {
            System.out.println(c);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    a[0] = i + 1;
                    a[1] = j + 1;
                    return a;
                }
            }
        }
        return a;
    }
}
