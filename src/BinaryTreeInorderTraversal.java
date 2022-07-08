import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveDive(result, root);
        return result;
    }

    private void recursiveDive(List<Integer> result, TreeNode root) {
        if (root != null) {
            recursiveDive(result, root.left);
            result.add(root.val);
            recursiveDive(result, root.right);
        }
    }
}
