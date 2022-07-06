import java.util.*;

public class LetterCombinationsPhoneNumber {
    private final static Map<Character, char[]> numbersToLetters = new HashMap<>() {{
        put('2', new char[]{'a', 'b', 'c'});
        put('3', new char[]{'d', 'e', 'f'});
        put('4', new char[]{'g', 'h', 'i'});
        put('5', new char[]{'j', 'k', 'l'});
        put('6', new char[]{'m', 'n', 'o'});
        put('7', new char[]{'p', 'q', 'r', 's'});
        put('8', new char[]{'t', 'u', 'v'});
        put('9', new char[]{'w', 'x', 'y', 'z'});
    }};

    private static void backtrack(List<String> combinations, String digits, String current) {
        if (digits.length() == current.length()) {
            combinations.add(current);
            return;
        }
        for (char letter : numbersToLetters.get(digits.charAt(current.length()))) {
            backtrack(combinations, digits, current + letter);
        }
    }


    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, digits, "");
        return result;
    }
}
