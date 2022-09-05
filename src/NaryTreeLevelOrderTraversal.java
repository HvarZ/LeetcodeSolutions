import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
    public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();

            int levelSize = queue.size();
            for (int i = 0; i < levelSize; ++i) {
                Node currentNode = queue.poll();

                currentLevel.add(currentNode.val);
                queue.addAll(currentNode.children);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
