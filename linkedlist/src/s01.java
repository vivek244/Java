import java.util.*;

public class s01 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }

        Node(int d, Node k) {
            this.data = d;
            this.next = k;
        }

        Node(Node k, Node a) {
            this.next = k;
            this.next = a;
        }
    }

    public static Node solve(Node head) {
        if (head == null || head.next == null)
            return head;
        Node z = new Node(0);
        Node a = z;
        Node o = new Node(0);
        Node b = o, curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                a.next = curr;
                a = a.next;
            } else {
                b.next = curr;
                b = b.next;
            }
            curr = curr.next;
        }
        a.next = o.next;
        b.next = null;
        return z.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node d = new Node(-1);
        Node p = d;
        while (n-- > 0) {
            p.next = new Node(sc.nextInt());
            p = p.next;
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
