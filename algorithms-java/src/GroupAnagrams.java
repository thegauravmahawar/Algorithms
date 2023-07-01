import java.util.*;

/**
 * @author Gaurav Mahawar
 * @see <a href="https://leetcode.com/problems/group-anagrams/">Group Anagrams</a>
 */
public class GroupAnagrams {

    public static void main(String... args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            List<String> anagrams;
            if (map.containsKey(sortedS)) {
                anagrams = map.get(sortedS);
            } else {
                anagrams = new ArrayList<>();
            }
            anagrams.add(s);
            map.put(sortedS, anagrams);
        }
        map.values().stream().forEach(groupedAnagrams::add);
        return groupedAnagrams;
    }
}
