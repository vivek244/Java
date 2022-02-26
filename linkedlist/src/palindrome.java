import java.util.Scanner;

public class palindrome {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }

        Node(int d, Node nn) {
            this.data = d;
            this.next = nn;
        }
    }

    static Node m(Node ss) {
        if (ss == null || ss.next == null)
            return ss;
        Node f = ss, s = ss;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    static Node r(Node ll) {
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

    static Node fold(Node head) {
        Node mid = m(head);
        Node nn = mid.next;
        mid.next = null;
        nn = r(nn);

        Node c1 = head, c2 = nn, f1 = null, f2 = null;
        while (c2 != null) {
            f1 = c1.next;
            f2 = c2.next;
            c1.next = c2;
            c2.next = f1;
            c1 = f1;
            c2 = f2;
        }
        return head;

    }

    static boolean solve(Node head) {
        if (head == null || head.next == null)
            return true;
        Node mid = m(head);
        Node nn = mid.next;
        mid.next = null;
        nn = r(nn);
        Node a = head, b = nn;
        while (a != null && b != null) {
            if (a.data != b.data) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return true;
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
        Node head = fold(d.next);
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("Null");
        System.out.println(solve(d.next));
        sc.close();
    }

}
