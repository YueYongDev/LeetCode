package t219;

import java.util.HashMap;

public class MyStack {
    public static void main(String[] args) {

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int sub=Math.abs(i-map.get(nums[i]));
                if (sub<=k)
                    return true;
                else
                    map.put(nums[i],i);
            }else
                map.put(nums[i],i);
        }
        return false;
    }
}
