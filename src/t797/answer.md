## 深度优先搜索
**思路：**
我们从起点00开始，对整张有向图进行深度优先遍历，同时记录途中经过的节点，当我们到达终点N-1N−1时，我们把记录的路径加入结果数组中。

**算法：**
pathpath存储我们途径的节点，当离开时将该节点从pathpath数组中弹出。
visitvisit数组记录我们访问过的节点，以避免重复访问进入死循环。

