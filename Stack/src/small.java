import java.util.Scanner;
import java.util.Stack;

public class small {

    static void solve(String s) {
        Stack<Integer> st = new Stack<>();
        int k = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'd') {
                st.push(k);
                k++;
            } else {
                st.push(k);
                k++;
                while (st.size() > 0) {
                    System.out.print(st.pop() + " ");
                }
            }
        }
        st.push(k);
        while (st.size() > 0) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solve(s);
        sc.close();
    }
}
