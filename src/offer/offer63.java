package offer;

/**
 * 剑指offer06题
 * 给定一个数组 prices ，它的第 i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class offer63 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    //前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
    public static int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            min = Math.min(min, prices[i-1]);

            result = Math.max(result, prices[i] - min);
        }

        return result;

    }
}



