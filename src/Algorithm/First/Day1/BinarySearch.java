package Algorithm.First.Day1;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int finish = nums.length - 1;

        while (start <= finish) {
            int mid = (start + finish) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else finish = mid - 1;
        }
        return -1;
    }
}
