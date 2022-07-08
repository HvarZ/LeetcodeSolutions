public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int current = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[current]) {
                int buffer = nums[i];
                nums[i] = nums[current];
                nums[current] = buffer;
            } else {
                i++;
            }
        }

        int j = 0;
        while (j != nums.length) {
            if (nums[j] != j + 1) {
                break;
            }
            j++;
        }

        return j + 1;
    }
}
