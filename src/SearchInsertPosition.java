/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/search-insert-position">Search Insert Position</a>
 */
public class SearchInsertPosition {

    public static void main(String... args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    private static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

}
