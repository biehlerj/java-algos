package leetcode_array;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = new int[] { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = new int[] { 1, 2, 3, 4, 5 };
        int[] prices3 = new int[] { 7, 6, 4, 3, 1 };

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }
}
