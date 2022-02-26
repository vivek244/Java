import java.util.Scanner;

public class merge {

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

    static Node mergea(Node a, Node b) {
        if (a == null || b == null)
            return a == null ? b : a;

        Node d = new Node(-1);
        Node p = d;
        Node c = a;
        Node v = b;
        while (c != null && v != null) {
            if (c.data > v.data) {
                p.next = v;
                v = v.next;
            } else {
                p.next = c;
                c = c.next;
            }
            p = p.next;
        }
        p.next = c == null ? v : c;
        return d.next;
    }

    static Node mid(Node ss) {
        Node f = ss, s = ss;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    static Node solve(Node ss) {
        if (ss == null || ss.next == null)
            return ss;
        Node n = mid(ss);
        Node nh = n.next;
        n.next = null;

        Node a = solve(ss), b = solve(nh);
        return mergea(a, b);
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
