import java.util.Map;
import java.util.HashMap;

public class LongestSubstringsWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> characters = new HashMap<>();
        int result = 0;
        int partResult = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (!characters.containsKey(s.charAt(i))) {
                characters.put(s.charAt(i), i);
                partResult++;
            } else {
                i = characters.get(s.charAt(i)) + 1;
                characters.clear();
                characters.put(s.charAt(i), i);
                result = Math.max(result, partResult);
                partResult = 1;
            }
        }

        return Math.max(result, partResult);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
