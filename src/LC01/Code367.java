package LC01;

import java.lang.reflect.Array;

public class Code367 {
    public static void main(String[] args) {
        int[] abc = {5, 3, 6, 1, 12};

        boolean perfectSquare = isPatternNum(808201);
        System.out.println(perfectSquare);
        System.out.println("+++++++++++++++++");;
        System.out.println(Math.sqrt(808201));
    }
    private static boolean isPatternNum(int num){
        if(num ==1){
            return true;
        }
        int right = num/2;
        int left = 2;
        int mid = (right+left)/2;
        int count = 0;
        while (right >= left){
            long tmp = (long) mid*mid;
            if(tmp == num){
                System.out.println(count);
                return true;
            }
            if(tmp > num){
                right = mid-1;
            }else {
                left = mid+1;
            }
            mid = left + (right-left)/2;

            count++;
        }
        System.out.println(count);
        return false;
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }


        int L = 0;
        int R = num;
        while (L <= R) {
            int mid = (R - L) / 2 + L;
            long square = (long) mid * mid;
            if (square < num) {
                L = mid + 1;
            } else if (square > num) {
                R = mid - 1;
            } else {
                return true;
            }

        }
        return false;

    }
}
