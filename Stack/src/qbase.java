import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class qbase {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qq = new ArrayDeque<>();

        q.add(12);
        qq.add(21);
        q.add(14);
        q.add(47);
        qq.add(54);
        qq.add(56);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        System.out.println(qq.peek());
        System.out.println(q.equals(qq));
        q.offer(5);
        // System.out.println(q.offer(3));
    }

}
