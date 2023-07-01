/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">Best Time to Buy and Sell Stock</a>
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String... args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{7, 11, 1, 2}));
        System.out.println(maxProfit(new int[]{7, 11, 22, 1, 2}));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) minValue = prices[i];
            else maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }
        return maxProfit;
    }
}
