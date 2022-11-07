package LC01;

public class Code209 {
    public static void main(String[] args) {
        int[] abc = {5, 3, 6, 1, 12};
        int ee = minSubArrayLen(3, abc);
        System.out.println(ee);
    }

    static int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {

        }

        return 0;
    }
}
