import java.util.Scanner;

public class segregate {

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

    static Node solve(Node ss) {
        if (ss == null || ss.next == null)
            return ss;
        Node oh = new Node(-1), eh = new Node(-1);
        Node et = eh, ot = oh, curr = ss;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                et.next = curr;
                et = et.next;
            } else {
                ot.next = curr;
                ot = ot.next;
            }
            curr = curr.next;
        }
        et.next = oh.next;
        ot.next = null;
        return eh.next;
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
