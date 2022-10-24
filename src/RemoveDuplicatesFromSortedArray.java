public class RemoveDuplicatesFromSortedArray {

    public static void main(String... args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    /**
     * @param nums a sorted array of integers
     * @return index of the last element after removing duplicates
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int k = 0;
        for (int num : nums) {
            if (k == 0 || num > nums[k - 1]) {
                nums[k++] = num;
            }
        }
        return k;
    }
}
