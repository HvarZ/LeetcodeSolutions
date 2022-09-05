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
        result.add(List.of(root.val));

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Queue<Node> temp = new LinkedList<>();
            List<Integer> currentLevel = new ArrayList<>();
            while (!queue.isEmpty()) {
                Node current = queue.remove();
                currentLevel.addAll(current.children.stream().mapToInt(x -> x.val).boxed().toList());
                temp.addAll(current.children);
            }
            queue = temp;
            if (!currentLevel.isEmpty()) {
                result.add(currentLevel);
            }
        }


        return result;
    }
}
