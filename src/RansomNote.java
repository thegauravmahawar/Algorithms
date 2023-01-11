import java.util.HashMap;
import java.util.Map;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/ransom-note">Ransom Note</a>
 */
public class RansomNote {

    public static void main(String... args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int count = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, count + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int count = magazineLetters.getOrDefault(r, 0);

            if (count == 0) return false;

            magazineLetters.put(r, count - 1);
        }

        return true;
    }
}
