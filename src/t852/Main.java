package t852;

/**
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class Main {

    public static void main(String[] args) {
        int[] A={0,2,1,0};
        System.out.println(new Main().peakIndexInMountainArray(A));
    }

    public int peakIndexInMountainArray(int[] A) {
        int left=0;
        int right=A.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if (A[mid]<A[mid+1])
                left=mid+1;
            else
                right=mid;
        }
        return left;
    }
}
