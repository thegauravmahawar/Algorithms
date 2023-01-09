/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/richest-customer-wealth">Richest Customer Wealth</a>
 */
public class RichestCustomerWealth {

    public static void main(String... args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }

    /**
     *
     * Time Complexity = O(m x n)
     * Space Complexity = O(1)
     *
     * @param accounts
     * @return
     */
    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customers : accounts) {
            int customerWealth = 0;
            for (int bank : customers) {
                customerWealth += bank;
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        return maxWealth;
    }
}
