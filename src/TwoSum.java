import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/two-sum">Two Sum</a>
 */
public class TwoSum {

    public static void main(String... args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    /**
     * We use a map to store the difference between the two numbers as key, and the index of current element as value.
     * With each iteration, we check if the current number is in the map, if no, we put the difference between target
     * and the current number as key in the map with the index of the current element as value.
     *
     * In any iteration, if we find that the current element is present in the map, that means we have found the second number
     * of the pair which adds up to target.
     *
     * @param nums an array of integers
     * @param target
     * @return integer array containing the indices of the two numbers such that they add up to target.
     */
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{};
    }
}
