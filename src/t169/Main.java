package t169;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.majorityElement(new int[]{1}));
    }

    /**
     * 算法基础：摩尔投票法
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        int majority = -1;

        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                majority = num;
                count++;
            } else {
                if (majority == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        int counter = 0;
        if (count <= 0) {
            return -1;
        } else {
            for (int num : nums) {
                if (num == majority) counter++;
            }
        }

        if (counter > nums.length / 2) {
            return majority;
        }

        return -1;
    }

//    public int majorityElement(int[] nums) {
//        int res = 0, cnt = 0;
//        for (int num : nums) {
//            if (cnt == 0) {res = num; ++cnt;}
//            else if (num == res) ++cnt;
//            else --cnt;
//        }
//        return res;
//    }

//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            map.put(nums[i], count);
//        }
//        Iterator iter = map.entrySet().iterator();
//        int max = 0;
//        int maxNum = nums[0];
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry) iter.next();
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            if ((int) val > max) {
//                max = (int) val;
//                maxNum = (int) key;
//            }
//        }
//        return maxNum;
//    }

}
