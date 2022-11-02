/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/binary-search">Binary Search</a>
 */
public class BinarySearch {

    public static void main(String... args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        System.out.println(search(new int[]{-1, 1, 3, 5, 9, 12}, 1));
        System.out.println(search(new int[]{0, 3, 5, 9, 12}, 5));
        System.out.println(search(new int[]{}, 2));
        System.out.println(search(new int[]{-5, -4, -3, -2, -1}, -2));
        System.out.println(search(new int[]{1, 2, 3, 4, 7}, 6));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, -1));
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 4));
    }

    /**
     * @param nums a sorted array of integers
     * @param target
     * @return
     */
    private static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
