/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/valid-palindrome">Valid Palindrome</a>
 */
public class ValidPalindrome {

    public static void main(String... args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        s.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(sb::append);

        return sb.toString().equals(sb.reverse().toString());
    }
}
