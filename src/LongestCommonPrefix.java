public class LongestCommonPrefix {
    public static class PrefixList {
        private static class Node {
            public char symbol;
            public Node nextNode;
            public Node(char s) {
                symbol = s;
            }
        }
        private Node root;

        public PrefixList(String word) {
            if (word.length() == 0) {
                root = null;
                return;
            }
            root = new Node(word.charAt(0));
            Node current = root;
            for (int i = 1; i < word.length(); ++i) {
                current.nextNode = new Node(word.charAt(i));
                current = current.nextNode;
            }
        }

        public void correctTree(String word) {
            if (word.length() == 0 || root == null) {
                root = null;
                return;
            } else if (word.charAt(0) != root.symbol){
                root = null;
                return;
            }
            Node current = root;
            int i = 0;
            while (current.nextNode != null) {
                if (i + 1 == word.length() || current.nextNode.symbol != word.charAt(i + 1)) {
                    current.nextNode = null;
                    break;
                }
                current = current.nextNode;
                i++;
            }
        }

        public String getFullPrefix() {
            if (root == null) {
                return "";
            }
            StringBuilder builder = new StringBuilder();
            Node current = root;

            while (current != null) {
                builder.append(current.symbol);
                current = current.nextNode;
            }

            return builder.toString();
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        PrefixList tree = new PrefixList(strs[0]);
        for (int i = 1; i < strs.length; ++i) {
            tree.correctTree(strs[i]);
        }

        return tree.getFullPrefix();
    }
}

