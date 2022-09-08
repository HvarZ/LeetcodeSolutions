package Algorithm.First.Day4;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char buf = s[right];
            s[right--] = s[left];
            s[left++] = buf;
        }
    }
}
