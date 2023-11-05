package LC01;

public class Code209bak {
    public static void main(String[] args) {
        int[] abc = {1, 2, 3, 4, 5};
        int ee = minSubArrayLen(11, abc);
        System.out.println(ee);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;

        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end ++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
