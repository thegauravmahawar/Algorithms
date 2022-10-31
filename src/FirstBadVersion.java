public class FirstBadVersion {

    public static void main(String... args) {
        System.out.println(firstBadVersion(1));
        System.out.println(firstBadVersion(5));
        System.out.println(firstBadVersion(2126753390));
    }

    /**
     *
     * @param n
     * @return
     */
    private static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            //prevent high + low overflow
            int mid = low + ((high - low) / 2);
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static boolean isBadVersion(int n) {
        return false;
    }
}
