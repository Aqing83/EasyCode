package LC01;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 */
public class Code04 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3,5,6,7,7,8,9,9};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    /**
     *
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m + n];
        for (int i = 0, j = 0, k = 0; i < m + n; i++) {
            if (j < m && k < n && nums1[j] >= nums2[k]) {
                arr[i] = nums2[k];
                k++;
            } else if ((j < m && k < n && nums1[j] < nums2[k])) {
                arr[i] = nums1[j];
                j++;
            } else if (k == n && j < m) {
                arr[i] = nums1[j];
                j++;
            } else if (k < n && j == m) {
                arr[i] = nums2[k];
                k++;
            }

        }
        int a = m + n;
        if (a % 2 != 0) {
            double mid = arr[a / 2];
            return mid;
        } else {
            double x = arr[a / 2], y = arr[a / 2 - 1];

            return ((x + y) / 2);
        }
    }

}
