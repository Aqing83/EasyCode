package LC01;

public class Code2148 {
    public static void main(String[] args) {
        int[] abc = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int ee = countElements(abc);
        System.out.println();
    }

    static int countElements(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int m1 = 0;
        int m2 = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[j] > max) {
                max = nums[j];
            }
            if (nums[j] < min) {
                min = nums[j];
            }
        }
        for (int num : nums) {
            if (num == max) {
                m1++;
                continue;
            }
            if (num == min) {
                m2++;
                continue;
            }
        }
        return nums.length - m1 - m2;
    }
}
