package LC01;

import javafx.scene.paint.RadialGradient;

public class Code704 {

    public static void main(String[] args) {
        int[] nums1 = {3,3,3,7,2,0};

//        System.out.println(guessNumber(nums1, 6));
//        System.out.println("====================");
        System.out.println(peakIndexInMountainArray(nums1));

    }

    /**
     * 二分查找
     *
     * @param nums1
     * @param target
     * @return
     */
    public static int search(int[] nums1, int target) {
        int L = 0;
        int R = nums1.length - 1;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            if (target == nums1[mid]) {
                return mid;
            } else if (nums1[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }

        }
        return -1;

    }

    public static int guessNumber(int[] nums, int target) {

        int L = 0;
        int R = nums.length - 1;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return L;

    }

    public static int peakIndexInMountainArray(int[] arr) {

        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            int mid = L + (R - L) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid - 1] < arr[mid]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1] && arr[mid - 1] > arr[mid]) {
                R = mid - 1;
            } else  {
                L = mid +1;
            }
        }

        return 0;
    }

}
