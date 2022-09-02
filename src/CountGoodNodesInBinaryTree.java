public class CountGoodNodesInBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int dive(TreeNode node, int maxPrevValue) {
        int result = 0;
        if (node == null) {
            return 0;
        }

        if (node.val >= maxPrevValue) {
            result++;
            maxPrevValue = node.val;
        }

        result += dive(node.left, maxPrevValue);
        result += dive(node.right, maxPrevValue);

        return result;
    }

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;

        count += dive(root.left, root.val);
        count += dive(root.right, root.val);

        return count;
    }
}
