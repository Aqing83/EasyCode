package offer;

import java.util.HashMap;

public class aa {

        public static void main(String[] args) {
            // 创建一个 HashMap
            HashMap<String, Integer> prices = new HashMap<>();

            // 往 HashMap 中插入映射项
            prices.put("Shoes", 200);
            prices.put("Bag", 300);
            prices.put("Pant", 150);
            System.out.println("Normal Price: " + prices);

            System.out.print("Discounted Price: ");

            //通过 lambda 表达式使用 forEach()
            prices.forEach((key, value) -> {
                // value 价格减少百分之 10
                value = value - value * 10/100;
                System.out.print(key + "=" + value + " ");
            });
        }
}
