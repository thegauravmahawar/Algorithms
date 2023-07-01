/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/guess-number-higher-or-lower/">Guess Number Higher or Lower</a>
 */
public class GuessNumberHigherOrLower {

    public static void main(String... args) {
        System.out.println(guessNumber(10));
    }

    private static int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = guess(mid);
            if (guess == 0) return mid;
            if (guess == -1) high = mid - 1;
            if (guess == 1) low = mid + 1;
        }
        return high;
    }

    private static int guess(int n) {
        return -1;
    }
}
