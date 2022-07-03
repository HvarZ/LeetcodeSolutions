import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class IntegerToRoman {
    private static final Map<Integer, String> romanNumbers = new HashMap<>(){{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        Stack<Integer> romanStack = new Stack<>();

        int i = 0;
        while (num > 0) {
            romanStack.add(num % 10);
            num /= 10;
            i++;
        }

        while (!romanStack.empty()) {
            int repeatNumber = romanStack.peek();
            if (repeatNumber == 0) {
                romanStack.pop();
                i--;
                continue;
            } else if (repeatNumber > 1 && repeatNumber <= 3) {
                for (int j = 0; j < repeatNumber; ++j) {
                    builder.append(romanNumbers.get((int)Math.pow(10, i - 1)));
                }
            } else if (repeatNumber > 5 && repeatNumber <= 8) {
                builder.append(romanNumbers.get((int)(5 * Math.pow(10, i - 1))));
                for (int j = 0; j < repeatNumber % 5; ++j) {
                    builder.append(romanNumbers.get((int)Math.pow(10, i - 1)));
                }
            } else {
                builder.append(romanNumbers.get((int)(repeatNumber * Math.pow(10, i - 1))));
            }
            romanStack.pop();
            i--;
        }

        return builder.toString();
    }
}
