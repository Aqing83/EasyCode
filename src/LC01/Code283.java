package LC01;

/**
 * 给定一个数组 nums,编写一个函数将所有 0 移动到数组的末尾,同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ,必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class Code283 {
    public static void main(String[] args) {
        int[] abc = {1, 0, 0, 0, 0, 0, 3, 4, 5};
        moveZeroes(abc);
        for (int i : abc) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                nums[l] = nums[i];
                l++;
            }
        }
        for (int i = l; i < nums.length; i++) {
            nums[i] = 0;

        }

    }
}

