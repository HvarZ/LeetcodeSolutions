package Algorithm.First.Day1;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0; int finish = nums.length - 1;
        while (start <= finish) {
            int averagePosition = (start + finish) / 2;
            if (nums[averagePosition] < target) {
                start = averagePosition + 1;
            } else if (nums[averagePosition] > target) {
                finish = averagePosition - 1;
            } else {
                return averagePosition;
            }
        }
        return start;
    }
}
