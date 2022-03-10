import java.util.LinkedList;

public class framework {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
        // framework list=new framework();
        LinkedList<Integer> ss = new LinkedList<>();
        ss.addFirst(12);
        ss.addLast(25);
        ss.addFirst(15);
        ss.addLast(70);
        ss.addFirst(20);
        // Node he = solve(ss.next);

        // System.out.println(ss.peekFirst());
        // ss.poll();
        // System.out.println(ss.poll());
        // System.out.println(ss.peekLast());

    }

}
