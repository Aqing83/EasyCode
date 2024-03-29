package LC01;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 5981. 分组得分最高的所有下标
 * <p>
 * 给你一个下标从 0 开始的二进制数组 nums ，数组长度为 n 。nums 可以按下标 i（ 0 <= i <= n ）拆分成两个数组（可能为空）：numsleft 和 numsright 。
 * <p>
 * numsleft 包含 nums 中从下标 0 到 i - 1 的所有元素（包括 0 和 i - 1 ），而 numsright 包含 nums 中从下标 i 到 n - 1 的所有元素（包括 i 和 n - 1 ）。
 * 如果 i == 0 ，numsleft 为 空 ，而 numsright 将包含 nums 中的所有元素。
 * 如果 i == n ，numsleft 将包含 nums 中的所有元素，而 numsright 为 空 。
 * 下标 i 的 分组得分 为 numsleft 中 0 的个数和 numsright 中 1 的个数之 和 。
 * <p>
 * 返回 分组得分 最高 的 所有不同下标 。你可以按 任意顺序 返回答案。
 */
public class Code5981 {
    public static void main(String[] args) {
        int[] abc = {5, 3, 6, 1, 12};
        List<Integer> integers = maxScoreIndices(abc);
        System.out.println(integers);
    }

    static List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> arrayList = new ArrayList<Integer>();
        if (nums.length == 0) {
            return arrayList;
        }
        List<Integer> abc = new ArrayList<Integer>();
        List<Map<String, String> >map = new ArrayList<>();
        //i为划分数组的下标
        for (int i = 0; i < nums.length; i++) {
            int[] numleft = new int[nums.length];
            int[] numright = new int[nums.length];
            int sum = 0;
            for (int j = 0; j < nums.length; i = j++) {
                if (i < j) {
                    if (nums[j] == 0) {
                        sum++;
                    }
                } else {
                    if (nums[j] == 1) {
                        sum++;
                    }
                }
            }

//            map.add()
//
//            map.put(i + "", sum + "");
        }
//        List<String> strings = map.keySet().stream()
//                .collect(Collectors.toList());
        ;
        return abc;
    }
}
