import java.util.Map;
import java.util.HashMap;

public class RomanToInteger {
    private static final Map<Character, Integer> romanNumbers = new HashMap<>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (i < s.length() - 1 && romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))) {
                result -= romanNumbers.get(s.charAt(i));
            } else {
                result += romanNumbers.get(s.charAt(i));
            }
        }
        return result;
    }
}
