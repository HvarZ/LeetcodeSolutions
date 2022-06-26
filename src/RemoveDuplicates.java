public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int key = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] != nums[i + 1]) {
                nums[key++] = nums[i];
            }
        }
        nums[key++] = nums[nums.length - 1];
        return key;
    }
}
