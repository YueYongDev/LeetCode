package t1010;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] time = {30, 20, 150, 100, 40};
        System.out.println(main.numPairsDivisibleBy60(time));
    }

//    // o(n^2) 超时了
//    public int numPairsDivisibleBy60(int[] time) {
//        Arrays.sort(time);
//        int count = 0;
//        for (int i = 0; i < time.length - 1; i++) {
//            for (int j = i + 1; j < time.length; j++) {
//                if ((time[j] + time[i]) % 60 == 0)
//                    count++;
//            }
//        }
//        return count;
//    }

    //用一个数组记录每个时间对应的模60结果的总和，如果两个数的模相加为60，则这两个数相加是60的倍数
    public int numPairsDivisibleBy60(int[] time) {
        int[] record = new int[60];
        int count = 0;
        for (int t : time) {
            t %= 60;        //求这个时间的余数
            if (t != 0)
                count += record[60 - t];    //如果时间余数不为0，找出相加为0的余数总和相加
            else count += record[t];        //如果为0，加其他为0的数
            record[t]++;
        }
        return count;
    }
}
