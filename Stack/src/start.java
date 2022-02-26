import java.util.Stack;

public class start {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(15);
        st.push(21);
        st.push(14);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());

    }
}