import java.util.Map;
import java.util.HashMap;

public class RomanToInteger {
    private static Map<Character, Integer> romanNumbers = new HashMap<>(){{
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
        int current, next = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            current = romanNumbers.get(s.charAt(i));
            next = romanNumbers.get(s.charAt(i + 1));
            if (current < next) {
                result += (next - current);
                ++i;
            } else {
                result += current;
            }
        }
        if (s.length() == 1) {
            result += romanNumbers.get(s.charAt(0));
        } else if (s.length() > 1 && (romanNumbers.get(s.charAt(s.length() - 1)) <= romanNumbers.get(s.charAt(s.length() - 2)))) {
            result += romanNumbers.get(s.charAt(s.length() - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MDCXCV"));
        System.out.println(romanToInt("D"));
    }
}
