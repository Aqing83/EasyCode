package GodLIeft;

/**
 * 左神算法第一题：
 * 绳子能覆盖最多的点
 */
public class one {

    public static void main(String[] args) {
        int[] abc = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(process(abc, 0, abc.length - 1));
        System.out.println("----------------------------");
        System.out.println(3 / 2);
    }

    public static int process(int[] arr, int L, int R) {
        //当L—R范围上只有一个数的时候
        if (L == R) {
            return arr[R];
        }
        int mid = (L + R) / 2;
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);

    }

    //精髓1：绳子不必覆盖到一个不存在的点上
}
