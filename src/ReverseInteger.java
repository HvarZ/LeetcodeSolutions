public class ReverseInteger {
    public static int reverse(int x) {
        int reversedNumber = 0;
        boolean isPositive = x > 0;
        x = Math.abs(x);

        while (x > 0) {
            try {
                reversedNumber = Math.addExact(Math.multiplyExact(reversedNumber, 10), x % 10);
                x /= 10;
            } catch (ArithmeticException e) {
                return 0;
            }
        }

        return isPositive ? reversedNumber : -reversedNumber;
    }
}
