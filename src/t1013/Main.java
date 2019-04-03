package t1013;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] A = {18, 12, -18, 18, -19, -1, 10, 10};
        System.out.println(main.canThreePartsEqualSum(A));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = sumOfArr(A);
        if (sum % 3 != 0) return false;

        int temp = 0;
        boolean flag1 = false;
        int index = 0;

        for (int i = 0; i < A.length - 1; i++) {
            temp += A[i];
            if (temp == sum / 3) {
                flag1 = true;
                index = i;
                break;
            }
        }

        boolean flag2 = false;
        temp = 0;
        if (flag1) {
            for (int i = A.length - 1; i > index; i--) {
                temp += A[i];
                if (temp == sum / 3) {
                    flag2 = true;
                    break;
                }
            }
        }


        return flag1 && flag2;
    }

    public int sumOfArr(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        return sum;
    }
}
