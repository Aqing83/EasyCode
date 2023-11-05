package LC01;

/**
 * 二分查找
 */
public class Code167 {
    public static void main(String[] args) {
        int[] abc = {1, 3, 5, 7, 9};
        int[] ints = twoSum(abc, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length < 2) {
            return result;
        } else if (numbers.length == 2) {
            if (numbers[1] + numbers[2] == target) {
                result[0] = 1;
                result[1] = 2;
            }
            return result;
        }
        int l = 0;
        int r = numbers.length - 1;
        for (int i = 1; i <= numbers.length; i++) {
            if (l == r) {
                return result;
            }
            if (numbers[l] + numbers[r] == target) {
                result[0] = l + 1;
                result[1] = r + 1;
                return result;
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }

        }
        return result;
    }

}
