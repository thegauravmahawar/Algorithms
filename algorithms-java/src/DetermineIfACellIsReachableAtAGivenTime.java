/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time">Determine if a Cell Is Reachable at a Given Time</a>
 */
public class DetermineIfACellIsReachableAtAGivenTime {

    public static void main(String... args) {
        System.out.println(isReachableAtTime(2, 4, 7, 7, 6));
        System.out.println(isReachableAtTime(3, 1, 7, 3, 3));
    }

    /**
     * sx = 3, sy = 1, fx = 7, fy = 3
     * xdiff = 4, ydiff = 2
     * min(xdiff, ydiff) = min(4, 2) = 2 step in diagonal direction, i.e., (5, 3),
     * move abs(xdiff - ydiff) steps in horizontal or vertical direction.
     *
     * @param sx
     * @param sy
     * @param fx
     * @param fy
     * @param t
     * @return
     */
    private static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xdiff = Math.abs(sx - fx), ydiff = Math.abs(sy - fy);
        if (xdiff == 0 && ydiff == 0 && t == 1) return false;
        return (Math.min(xdiff, ydiff) + Math.abs(xdiff - ydiff)) <= t;
    }

}
