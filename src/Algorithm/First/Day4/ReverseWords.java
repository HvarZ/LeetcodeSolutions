package Algorithm.First.Day4;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length - 1; ++i) {
            result.append(reverseWord(words[i])).append(" ");
        }
        result.append(reverseWord(words[words.length - 1]));

        return result.toString();
    }

    public String reverseWord(String s) {
        int left = 0, right = s.length() - 1;
        StringBuilder builder = new StringBuilder(s);

        while (left < right) {
            char buf = builder.charAt(right);
            builder.setCharAt(right--, builder.charAt(left));
            builder.setCharAt(left++, buf);
        }

        return builder.toString();
    }
}
