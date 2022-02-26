import java.util.HashSet;
import java.util.Scanner;

public class union {

    static class Node {
        int data;
        Node next;

        Node(int a) {
            this.data = a;
        }

        Node(int a, Node aa) {
            this.data = a;
            this.next = aa;
        }

        Node(Node a, Node b) {
            this.next = a;
            this.next = b;
        }

    }

    static Node solve(Node a, Node b) {
        if (a == null || b == null)
            return a == null ? b : a;
        Node t = a;
        while (t.next != null) {
            t = t.next;
        }
        t.next = b;
        Node res=sol(a);
        return res;
    }
    public static Node sol(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
        return head;
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
        int m = sc.nextInt();
        Node c = new Node(-1);
        Node q = d;
        while (m-- > 0) {
            q.next = new Node(sc.nextInt());
            q = q.next;
        }
        Node ans = solve(d.next, c.next);
        while (ans != null) {
            System.out.print(ans.data + "->");
            ans = ans.next;
        }
        System.out.println("Null");
        sc.close();
    }

}
