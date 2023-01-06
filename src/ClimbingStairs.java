/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/climbing-stairs">Climbing Stairs</a>
 */
public class ClimbingStairs {

    public static void main(String... args) {
        System.out.println(climbStairs(climbStairs(2)));
        System.out.println(climbStairs(climbStairs(3)));
    }

    private static int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
