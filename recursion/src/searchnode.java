import java.util.Scanner;

public class searchnode {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    };

    static boolean ifNodeExists(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        boolean l = ifNodeExists(root.left, key);
        if (l) {
            return true;
        }
        boolean r = ifNodeExists(root.right, key);
        return r;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.left.left = new Node(3);
        root.left.left.left = new Node(7);
        root.left.right = new Node(4);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right = new Node(2);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        if (ifNodeExists(root, key))
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }

}
