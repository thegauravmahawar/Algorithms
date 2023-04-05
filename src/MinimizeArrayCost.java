/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/discuss/interview-question/1874750/minimize-array-cost/">Minimize Array Cost</a>
 */
public class MinimizeArrayCost {

    public static void main(String... args) {
        System.out.println(getMinimizeCost(new int[]{1, 3, 5, 2, 10}));
        System.out.println(getMinimizeCost(new int[]{4, 7, 1, 4}));
    }

    private static long getMinimizeCost(int[] nums) {
        long cost = 0;
        int i = 1;
        int diff;
        int maxDiff = 0;
        int num1 = 0;
        int num2 = 0;
        while (i < nums.length) {
            diff = Math.abs(nums[i] - nums[i - 1]);
            if (diff > maxDiff) {
                num1 = nums[i - 1];
                num2 = nums[i];
                maxDiff = diff;
            }
            cost += ((long) diff * diff);
            i++;
        }
        cost -= ((long) Math.abs(num2 - num1) * Math.abs(num2 - num1));
        int avg = (num1 + num2) / 2;
        cost += ((long) Math.abs(avg - num1) * Math.abs(avg - num1));
        cost += ((long) Math.abs(num2 - avg) * Math.abs(num2 - avg));
        return cost;
    }
}
