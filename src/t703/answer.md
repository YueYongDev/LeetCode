[703. 数据流中的第K大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/)

维护一个最小堆，堆的元素个数为常量 k，新加入一个元素和堆顶比较，如果比堆顶元素小，丢弃，否则删除堆顶元素，插入新元素。

