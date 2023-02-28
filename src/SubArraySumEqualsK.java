import java.util.HashMap;
import java.util.Map;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/subarray-sum-equals-k/">Subarray Sum Equals K</a>
 */
public class SubArraySumEqualsK {

    public static void main(String... args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(subarraySum(new int[]{1, 1, 1}, 1));
    }

    private static int subarraySum(int[] nums, int k) {
        int count = 0;
        int subArraySum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            subArraySum = subArraySum + num;
            if (subArraySum == k) count++;

            if (map.containsKey(subArraySum - k)) {
                count += map.get(subArraySum - k);
            }

            if (map.containsKey(subArraySum)) {
                map.put(subArraySum, map.get(subArraySum) + 1);
            } else {
                map.put(subArraySum, 1);
            }
        }
        return count;
    }
}
