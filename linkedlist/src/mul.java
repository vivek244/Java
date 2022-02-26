import java.util.Scanner;

public class mul {

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

        Node sole(Node a, Node b) {
            return null;
        }
    }

    static Node r(Node h) {
        if (h == null)
            return null;
        Node p = null, c = h, f = null;
        while (c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    static void add(Node a, Node b) {
        Node m = a, n = b;
        int carry = 0;
        while (m != null || carry != 0) {
            int sum = carry + (m == null ? 0 : m.data) + (n.next == null ? 0 : n.next.data);
            int di = sum % 10;
            carry = sum / 10;
            if (n.next != null)
                n.next.data = di;
            else
                n.next = new Node(di);
            if (m != null)
                m = m.next;
            n = n.next;
        }
    }

    static Node md(Node a, int n) {
        Node d = new Node(-1);
        Node p = d, c = a;
        int carry = 0;
        while (c != null || carry != 0) {
            int sum = carry + (c == null ? 0 : c.data) * n;
            int di = sum % 10;
            carry = sum / 10;
            p.next = new Node(di);
            if (c != null)
                c = c.next;
            p = p.next;
        }
        return d.next;
    }

    public static Node solve(Node a, Node b) {
        a = r(a);
        b = r(b);
        Node s = b;
        Node res = new Node(-1);
        Node p = res;
        while (s != null) {
            Node pr = md(a, s.data);
            s = s.next;
            add(pr, p);
            p = p.next;
        }
        return r(res.next);

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
