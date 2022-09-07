package Algorithm.First.Day2;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int start = 0, finish = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (Math.abs(A[start]) > Math.abs(A[finish])) {
                result[i] = A[start] * A[start];
                start++;
            } else {
                result[i] = A[finish] * A[finish];
                finish--;
            }
        }
        return result;
    }
}
