import java.util.Stack;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class ValidParentheses {

    public static void main(String... args) {
        System.out.println(isValid("[({})]"));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char c1 = stack.pop();
                if (c1 == '{' && c != '}') return false;
                if (c1 == '[' && c != ']') return false;
                if (c1 == '(' && c != ')') return false;
            }
        }
        return stack.isEmpty();
    }
}
