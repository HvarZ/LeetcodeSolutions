package Algorithm.First.Day6;

import java.util.Set;
import java.util.HashSet;

public class LongestSubstringsWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();

        int left = 0, right = 0;
        int max = 0;
        char character;
        while (right < s.length()) {
            character = s.charAt(right);
            if (!characters.contains(character)) {
                characters.add(character);
                right++;
                max = Math.max(max, characters.size());
            } else {
                characters.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
