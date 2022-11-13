import java.util.Arrays;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array">Squares of a Sorted Array</a>
 */
public class SquaresOfASortedArray {

    public static void main(String... args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    /**
     * We use two pointers technique here, where one pointer is at the start of the array and the other at the end of the array.
     * We also use a result array to store the squares of each number in a sorted manner.
     *
     * We loop over the array and using the two pointers at each end, compare the absolute values of the two indices
     * where the pointers are pointing.
     *
     * @param nums
     * @return
     */
    private static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int value;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                value = nums[right];
                right--;
            } else {
                value = nums[left];
                left++;
            }
            result[i] = value * value;
        }
        return result;
    }
}
