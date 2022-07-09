public class MaximumDepthBinaryTree {
    public class TreeNode {
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

    public int dive(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        } else {
            return Math.max(dive(node.left, depth + 1), dive(node.right, depth + 1));
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dive(root, 0);
    }
}
