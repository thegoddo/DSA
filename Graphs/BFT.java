package Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFT {

    private class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public void visit() {
            System.out.println("Visited node with value: " + value);
        }
    }

    public void breadthFirstSearch(Node root) {
        if (root != null) {
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node node = queue.remove();
                node.visit();

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
}
