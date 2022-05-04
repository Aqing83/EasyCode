package LC01;

public class Code11 {
    public static void main(String[] args) {
        int[] abc = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(abc));

    }

    /**
     * 最大容水量应该为两个节点之间的距离*两个节点最低的
     *
     * @return
     */
    public static int maxArea(int[] height) {
        if (height.length < 1) {
            return 0;
        }
        int max = 0;
        int small = 0;
        int big = height.length - 1;
        while (big != small) {
            if (height[small] > height[big]) {
                max = Math.max(max, height[big--] * (big - small + 1));
            } else {
                max = Math.max(max, height[small++] * (big - small + 1));
            }
        }
        return max;

    }

}
