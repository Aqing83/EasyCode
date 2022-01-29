package LC01;

public class Code2149 {
    public static void main(String[] args) {
        int[] abc = {3,1,-2,-5,2,-4};
        int[] ee= rearrangeArray(abc);
        System.out.println();
    }

     static int[] rearrangeArray(int[] nums) {
        int[] re = new int[nums.length];
        //正整数数组
        int[] re3 = new int[nums.length];
        int r1 = 0;
        //负整数数组
        int[] re1 = new int[nums.length];
        int r2 = 0;

        for (int num : nums) {
            if (num < 0) {
                re1[r2++] = num;
            } else {
                re3[r1++] = num;
            }
        }
        r1 = 0;
        r2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                re[i] = re3[r1++];
            }else {
                re[i] = re1[r2++];

            }
        }

        return re;
    }
}
