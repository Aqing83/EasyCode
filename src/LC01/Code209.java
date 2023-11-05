package LC01;

public class Code209 {
    public static void main(String[] args) {
        int[] abc = {2, 3, 1, 2, 4, 3};
        int ee = minSubArrayLen(7, abc);
        System.out.println(ee);
    }

    static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
            ;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
