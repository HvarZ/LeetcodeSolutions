package Algorithm.First.Day3;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            int index = binarySearch(numbers, target - numbers[i], i + 1);
            if (index != -1) {
                return new int[]{i + 1, index + 1};
            }
        }
        return new int[0];
    }

    public int binarySearch(int[] numbers, int target, int start) {
        int finish = numbers.length - 1;

        while (start <= finish) {
            int middle = (start + finish) / 2;
            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] < target) {
                start = middle + 1;
            } else {
                finish = middle - 1;
            }
        }
        return -1;
    }
}
