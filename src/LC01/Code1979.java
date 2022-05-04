package LC01;

public class Code1979 {
    public static void main(String[] args) {
        int[] abc = {100, 80};
        int ee = findGCD2(abc);
        System.out.println(ee);
    }

    /**
     * 暴力破解
     *
     * @param nums
     * @return
     */
    public static int findGCD(int[] nums) {
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for (int t : nums) {
            big = Math.max(big, t);
            small = Math.min(small, t);
        }

        if (big % small == 0) {
            return small;
        }
        for (int i = small / 2; i > 0; i--) {
            if (small % i == 0 && big % i == 0) {
                return i;
            }
        }
        return 0;

    }

    /**
     * 辗转相除法
     *
     * @param nums
     * @return
     */
    public static int findGCD2(int[] nums) {
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for (int t : nums) {
            big = Math.max(big, t);
            small = Math.min(small, t);
        }
        return find(big,small);

    }

    public static int find(int max, int min) {
        if (max % min == 0) {
            return min;
        } else {
            return find(min, max % min);
        }
    }

}
