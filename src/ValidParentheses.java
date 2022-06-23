import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    private static final Map<Character, Character> parentheses = new HashMap<>() {{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};

    public static boolean isValid(String s) {
        if (s.length() <= 1 && (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                } else if (s.charAt(i) == parentheses.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
