package Algorithm.First;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int finish = nums.length;
        while (start <= finish) {
            int middle = start + (finish - start) / 2;
            if (nums[middle] < target) {
                if (middle == start) {
                    return -1;
                }
                start = middle;
            } else if (nums[middle] > target) {
                if (middle == finish) {
                    return -1;
                }
                finish = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
