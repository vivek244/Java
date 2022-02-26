import java.util.*;

public class sli {

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

    public static Node solve(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        int id = 0, dd = 0;
        Node curr = head;
        while (curr != null) {
            if (id == k) {
                dd = curr.data;
                break;
            }
            curr = curr.next;
            id++;
        }
        Node s = new Node(0), l = new Node(0);
        Node a = s, b = l, c = head, p = null;
        id = 0;
        while (c != null) {
            if (id == k)
                p = c;
            else if (c.data <= dd) {
                a.next = c;
                a = a.next;
            } else {
                b.next = c;
                b = b.next;
            }
            c = c.next;
            id++;
        }
        a.next = p;
        p.next = l.next;
        b.next = null;
        return s.next;
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
        int k = sc.nextInt();
        Node head = solve(d.next, k);
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
        sc.close();
    }

}
