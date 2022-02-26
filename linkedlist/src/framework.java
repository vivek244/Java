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

    public static void main(String[] args) {
        // framework list=new framework();
        LinkedList<Integer> ss = new LinkedList<>();
        ss.addFirst(12);
        ss.addLast(25);
        ss.addFirst(15);
        ss.addLast(70);
        ss.addFirst(20);
        System.out.println(ss.peekFirst());
        ss.poll();
        System.out.println(ss.poll());
        System.out.println(ss.peekLast());

    }

}
