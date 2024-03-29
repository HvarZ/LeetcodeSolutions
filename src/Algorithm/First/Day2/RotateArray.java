package Algorithm.First.Day2;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        if (k < 0) {
            k += nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int finish) {
        while (start < finish){
            int buf = nums[finish];
            nums[finish--] = nums[start];
            nums[start++] = buf;
        }
    }
}
