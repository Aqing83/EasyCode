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
        int result = 0;

        int l = 0;
        int r = height.length - 1;

        while (l != r) {
            int min = Integer.min(height[l], height[r]);
            result = Integer.max(result, (r - l) * min);
            if (height[l] < height[r]) {
                l++;
            }else{
                r--;
            }
        }

        return result;
    }

}
