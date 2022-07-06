import java.util.*;

public class LetterCombinationsPhoneNumber {
    private final static Map<Character, List<Character>> numbersToLetters = new HashMap<>() {{
        put('2', Arrays.asList('a', 'b', 'c'));
        put('3', Arrays.asList('d', 'e', 'f'));
        put('4', Arrays.asList('g', 'h', 'i'));
        put('5', Arrays.asList('j', 'k', 'l'));
        put('6', Arrays.asList('m', 'n', 'o'));
        put('7', Arrays.asList('p', 'q', 'r', 's'));
        put('8', Arrays.asList('t', 'u', 'v'));
        put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }};


    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        StringBuilder current = new StringBuilder();
        result.add("");

        while (result.peek().length() < digits.length()) {
            current.append(result.poll());

            for (char c : numbersToLetters.get(digits.charAt(current.length()))) {
                result.add(current.toString() + c);
            }
            current.setLength(0);
        }
        return result;
    }
}
