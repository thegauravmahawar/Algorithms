/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">Maximum Subarray</a>
 */
public class MaximumSubarray {

    public static void main(String... args) {

    }

    private static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int subArraySum = 0;

        for (int num : nums) {
            subArraySum = Math.max(subArraySum + num, num);
            maxSum = Math.max(subArraySum, maxSum);
        }

        return maxSum;
    }
}
