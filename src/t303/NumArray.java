package t303;

class NumArray {

    int[] arr;
    public NumArray(int[] nums) {
        arr = new int[nums.length];
        if(nums.length > 0){
            arr[0] = nums[0];
            for(int i=1;i<nums.length;i++){
                arr[i] = arr[i-1] + nums[i];
            }
        }

    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return arr[j];
        else
            return arr[j] - arr[i-1];
    }
}