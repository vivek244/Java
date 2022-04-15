
// import java.util.LinkedList;
import java.util.Queue;

class binary {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    // static int idx = -1;

    // public static Node buildTree(int nodes[]) {
    // idx++;
    // if (nodes[idx] == -1) {
    // return null;
    // }
    // Node newNode = new Node(nodes[idx]);
    // newNode.left = buildTree(nodes);
    // newNode.right = buildTree(nodes);
    // return newNode;
    // }

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print("");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                // queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left, right) + 1;
        return max;
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, 7, -1, -1, -1, 5, -1, 8, -1, -1, 3, -1, 6, -1, 9,
        // -1, -1 };
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        // Node root = buildTree(nodes);
        preorder(node);
        System.out.println();
        levelOrder(node);
        System.out.println(height(node));
        // System.out.println(root.data);

    }
}