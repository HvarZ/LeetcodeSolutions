public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String stringNumber = String.valueOf(x);

        for (int i = 0; i < stringNumber.length() / 2; ++i) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String... args) {
        System.out.println(isPalindrome(15531));
    }
}
