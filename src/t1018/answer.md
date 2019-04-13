[1018. 可被 5 整除的二进制前缀](https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/)

```text
//思路：
//[1,1,1,0,1]
//第一步：[1] = 0*2+1 = 1;			//被5取模=1
//第二步：[1,1] = 1*2+1 = 3;			//被5取模=3
//第三步：[1,1,1] = 3*2+1 = 7;		        //被5取模=2
//第四步：[1,1,1,0] = 7*2+0 = 14;		//被5取模=4
//第五步：[1,1,1,0,1] = 14*2+1 = 29;	        //被5取模=4
//如果每步计算2的幂，结果会越来越大，java没有基本类型可以承受如此大的结果
//考虑采用每次结果的模进行计算
//第一步：[1] = (0*2+1)%5 = 1;			//被5取模=1
//第二步：[1,1] = (1*2+1)%5 = 3;			//被5取模=3
//第三步：[1,1,1] = (3*2+1)%5 = 2;		//被5取模=2
//第四步：[1,1,1,0] = (2*2+0)%5 = 4;		//被5取模=4
//第五步：[1,1,1,0,1] = (4*2+1)%5 = 4;	        //被5取模=4
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {0, 1, 1, 1, 1, 1};
        List<Boolean> list = main.prefixesDivBy5(a);
        for (Boolean b : list) {
            System.out.println(b);
        }
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int mod = 0;
        for (int i : A) {
            mod = (mod * 2 + i) % 5;
            if (mod == 0)
                list.add(true);
            else list.add(false);
        }
        return list;
    }
}
```