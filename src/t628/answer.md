[628. 三个数的最大乘积](https://leetcode-cn.com/problems/maximum-product-of-three-numbers/)

先排序，然后比较三个最大的正数和最小的两个负数及最大正数大乘积即可
```angelscript
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int x1 = nums[0] * nums[1] * nums[len-1];
        int x2 = nums[len-3] * nums[len - 1] * nums[len - 2];
        if (x1 >= x2) return x1;
        else return x2;
    }
}
```