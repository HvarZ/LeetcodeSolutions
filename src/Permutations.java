import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public void backtrack(List<List<Integer>> result, List<Integer> current, boolean[] usedNums, final int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = 0; i < nums.length; ++i) {
                if (!usedNums[i]) {
                    usedNums[i] = true;
                    current.add(nums[i]);
                    backtrack(result, current, usedNums, nums);
                    current.remove(current.size() - 1);
                    usedNums[i] = false;
                }
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new boolean[nums.length], nums);
        return result;
    }
}
