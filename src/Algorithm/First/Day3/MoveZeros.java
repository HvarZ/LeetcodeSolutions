package Algorithm.First.Day3;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int zeroPos = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[zeroPos++] = num;
            }
        }

        while (zeroPos < nums.length) {
            nums[zeroPos++] = 0;
        }
    }
}
