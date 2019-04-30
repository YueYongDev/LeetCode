[950. 按递增顺序显示卡牌](https://leetcode-cn.com/problems/reveal-cards-in-increasing-order/)

提供一个新思路，以[17,13,11,2,3,5,7]为例，首先新建等长list=[1,2,3,4,5,6,7],然后对新的list按照题目的做法处理得到[1,3,5,7,4,2,6]。
这时候注意[1,3,5,7,4,2,6]和[2,3,5,7,11,13,17]是一一对应的，因此我们构建对应关系[(1,2),(3,3),(5,5),(7,7),(4,11),(2,13),(6,17)]
最后按照元组的第一个元素排序得到的结果就是答案
[x1,x2,x3,x4,x5,x6,x7] -> [2,3,5,7,11,13,17]
[1,2,3,4,5,6,7] -> [1,3,5,7,4,2,6]
从->右边得到对应关系，然后左边用这个对应关系就可以得到x1,x2,....x7

```text
public int[] deckRevealedIncreasing(int[] deck) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < deck.length; i++) {
        list.add(i + 1);
    }
    int len = list.size();
    boolean flag = true;
    for (int i = 0; i < list.size(); i++) {
        if (!flag) {
            int temp = list.get(i);
            list.remove(i);
            i--;
            list.add(temp);
            flag = true;
        } else {
            flag = false;
        }
    }
    Arrays.sort(deck);
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
        map.put(list.get(i), deck[i]);
    }
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
        result[i] = map.get(i + 1);
    }
    return result;
}
```