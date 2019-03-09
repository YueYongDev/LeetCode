package t860;

/**
 * https://leetcode-cn.com/problems/lemonade-change/
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 20, 5, 5, 5, 5, 5, 5, 5, 10, 5, 20, 20, 5, 5, 5, 5, 5, 10, 5, 5, 5, 20, 5, 5, 5, 10, 5, 5, 10, 5, 20, 5, 5, 20, 5, 10, 5, 5, 20, 5, 5, 5, 5, 5, 5, 10, 20, 5, 20, 20, 10, 5, 20, 20, 5, 10, 5, 5, 5, 5, 5, 5, 20, 20, 20, 20, 5, 5, 10, 5, 20, 5, 5, 5, 5, 10, 10, 5, 5, 5, 20, 5, 5, 5, 5, 5, 5, 20, 5, 20, 10, 10, 20, 5, 5, 5, 5, 20, 20, 5, 5, 5, 5, 20, 5, 20, 20, 5, 5, 10, 5, 5, 5, 20, 5, 5, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 20, 5, 5, 10, 20, 20, 5, 5, 10, 20, 5, 5, 5, 5, 10, 20, 5, 5, 10, 20, 5, 10, 10, 5, 5, 5, 5, 5, 5, 10, 10, 10, 5, 10, 5, 10, 5, 5, 10, 10, 5, 5, 5, 20, 5, 20, 10, 20, 5, 5, 5, 20, 10, 5, 5, 20, 5, 5, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, 10, 5, 5, 10, 5, 5, 10, 5, 10, 5, 20, 10, 5, 10, 10, 5, 5, 5, 5, 10, 5, 5, 5, 20, 5, 5, 5, 5, 10, 5, 10, 10, 5, 20, 20, 5, 10, 10, 10, 5, 10, 5, 10, 5, 10, 5, 5, 10, 5, 5, 5, 20, 5, 5, 20, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 20, 5, 5, 5, 5, 10, 5, 5, 5, 20, 5, 5, 5, 5, 10, 20, 5, 5, 5, 20, 20, 5, 10, 5, 5, 5, 10, 5, 10, 20, 20, 5, 5, 5, 5, 5, 5, 20, 10, 5, 10, 5, 5, 20, 10, 5, 5, 5, 20, 5, 5, 5, 5, 5, 5, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 10, 5, 10, 5, 10, 20, 10, 10, 5, 5, 20, 10, 20, 5, 5, 5, 10, 5, 5, 5, 10, 5, 20, 20, 20, 10, 20, 5, 5, 5, 5, 20, 5, 20, 5, 10, 5, 5, 5, 5, 5, 5, 20, 5, 10, 5, 5, 5, 20, 5, 5, 5, 10, 10, 5, 5, 5, 5, 5, 20, 20, 20, 5, 5, 5, 5, 20, 5, 20, 5, 20, 20, 10, 10, 5, 5, 5};
        System.out.println(main.lemonadeChange(a));
    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0;  //记录五元的个数
        int ten = 0;  //记录十元的个数

        for (int bill : bills) {
            //收到5元
            if (bill == 5) {
                five++;
            } else if (bill == 10) { //收到10元
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {//收到20元

                if (five > 0 && ten > 0) {  // 5元 10元都有
                    five--;
                    ten--;
                } else if (five >= 3) { // 超过3张5元
                    five -= 3;
                } else {
                    return false;
                }

            }

        }
        return true;
    }
}
