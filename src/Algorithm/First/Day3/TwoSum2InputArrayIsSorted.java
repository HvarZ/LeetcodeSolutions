package Algorithm.First.Day3;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, finish = numbers.length - 1;
        while (numbers[start] + numbers[finish] != target) {
            if (numbers[start] + numbers[finish] > target) {
                finish--;
            }
            else {
                start++;
            }
        }
        return new int[]{start + 1, finish + 1};
    }
}
