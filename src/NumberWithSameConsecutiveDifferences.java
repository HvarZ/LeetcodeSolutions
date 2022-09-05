import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberWithSameConsecutiveDifferences {
    public static int[] numsSameConsecDiff(int n, int k) {
        if (n == 1) {
            return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }

        List<Integer> queue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (int level = 0; level < n - 1; ++level) {
            List<Integer> competeNumbers = new ArrayList<>();
            for (Integer number : queue) {
                int lastNumber = number % 10;
                if (k == 0) {
                    competeNumbers.add(number * 10 + lastNumber);
                    continue;
                }
                if (lastNumber + k < 10) {
                    competeNumbers.add(number * 10 + (lastNumber + k));
                }
                if (lastNumber - k >= 0) {
                    competeNumbers.add(number * 10 + (lastNumber - k));
                }
            }
            queue = competeNumbers;
        }

        return queue.stream().mapToInt(i -> i).toArray();
    }
}
