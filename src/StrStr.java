public class StrStr {
    public static int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i < haystack.length(); ++i) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = i; j < haystack.length() && j - i < needle.length(); ++j) {
                    if (needle.charAt(j - i) != haystack.charAt(j)) {
                        break;
                    }
                    if ((j - i) + 1 == needle.length()) {
                        return i;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
