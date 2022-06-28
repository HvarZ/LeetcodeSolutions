public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int lengthArray = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[i] != nums[j]) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        lengthArray++;
                        break;
                    }
                }
            } else {
                lengthArray++;
            }
        }
        return lengthArray;
    }


    public static void main(String[] args) {
        int[] array = new int[] {0,1,2,2,3,0,4,2};
        int length = removeElement(array, 2);

        for (int i = 0; i < length; ++i) {
            System.out.println(array[i]);
        }

    }
}
