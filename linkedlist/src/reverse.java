import java.util.Scanner;

public class reverse {

    // static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d, Node kk) {
            this.data = d;
            this.next = kk;
        }

        Node(int d) {
            this.data = d;
        }
    }

    static Node solve(Node ll) {
        if (ll == null || ll.next == null) {
            return ll;
        }
        Node curr = ll, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node d = new Node(-1);
        Node prev = d;
        while (n-- > 0) {
            prev.next = new Node(sc.nextInt());
            prev = prev.next;
        }
        Node head = solve(d.next);
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
        sc.close();
    }

}
