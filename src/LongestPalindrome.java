import java.util.HashMap;
import java.util.Map;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/longest-palindrome/">Longest Palindrome</a>
 */
public class LongestPalindrome {

    public static void main(String... args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("adam"));
    }

    private static int longestPalindrome(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int odd = (int) map.values().stream()
                .filter(freq -> freq % 2 != 0)
                .count();

        return odd > 0 ? len - odd + 1 : len;
    }
}
