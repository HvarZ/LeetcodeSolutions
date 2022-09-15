package Algorithm.First.Day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        List<Node> bfsArray = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }

            bfsArray.add(current);
        }

        int levelCounter = 1, levelController = 1;
        for (int i = 0; i < bfsArray.size(); ++i) {
            if (levelCounter < levelController) {
                bfsArray.get(i).next = bfsArray.get(i + 1);
                levelCounter++;
            } else {
                levelCounter = 1;
                levelController <<= 1;
            }
        }

        return root;
    }
}
