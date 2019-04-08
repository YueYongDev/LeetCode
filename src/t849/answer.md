[849. 到最近的人的最大距离](https://leetcode-cn.com/problems/maximize-distance-to-closest-person/)

我们将有人的座位的下标记录到一个list中，剩下的事情就是要找一个点，距离list中某个元素的最大距离

以示例1为例，我们构造了一个list，为[0,4,6]，那么你想找的那个点的下标一定是在0-4和4-6之间，所以只需要求出他们之间的中点距离即可。
以示例2为例，我们构造了一个list，为[0]，那么你想找的那个店的下标一定在0-seats.length之间，依次比较即可。

所以我们可以将此题抽象出来，假设有一个seats数组，为[a0,a1,a2.....an]，其中有人的为i，j，k，那么我们要找的点就一定在0-i,i-j,j-k和k-seats.length之间，依次比较即可。

```text
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1, 0, 0, 0, 1, 0, 1};
        System.out.println(main.maxDistToClosest(a));
    }

    public int maxDistToClosest(int[] seats) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1)
                list.add(i);
        }
        int start = list.get(0);
        int end = seats.length - list.get(list.size() - 1) - 1;
        int max = Math.max(start, end);

        for (int i = 0; i < list.size() - 1; i++) {
            int temp = (list.get(i + 1) - list.get(i)) / 2;
            if (temp > max) max = temp;
        }

        return max;
    }
}
```