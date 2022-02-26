public class somebase {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void af(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    public void al(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = nn;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public void df() {
        head = head.next;
    }

    public void din(int i) {
        Node curr = head;
        if (i == 0) {
            head = curr.next;
            return;
        }
        for (int j = 0; curr != null && j < i - 1; j++) {
            curr = curr.next;
        }
        Node next = curr.next.next;
        curr.next = next;
    }

    public void dkey(int key) {
        Node curr = head, prev = null;
        if (curr.data == key) {
            head = curr.next;
            return;
        }
        while (curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }

    public static void main(String[] args) {
        somebase list = new somebase();
        list.af(12);
        list.af(20);
        list.al(10);
        list.af(14);
        list.al(78);
        list.print();
        list.df();
        list.print();
        list.din(2);
        list.print();
        list.dkey(12);
        list.print();
    }
}
