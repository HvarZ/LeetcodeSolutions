public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int lengthArray = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[lengthArray] = nums[i];
                lengthArray++;
            }
        }
        return lengthArray;
    }
}
