package LC01;

public class Code5993 {
    public static void main(String[] args) {
        int[] abc = {5,3,6,1,12};
        int ee = findFinalValue(abc, 3);
        System.out.println(ee);
    }

    static int findFinalValue(int[] nums, int original) {
        if (original == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original){
                original = original*2;
                i=-1;
            }
        }

        return original;
    }
}
