import java.util.Scanner;
import java.util.Stack;

public class hist {

    static int histogram(int arr[]) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int res = 0;
        for (int i = 0; i <= arr.length; i++) {
            int k = i == arr.length ? 0 : arr[i];
            while (st.peek() != -1 && arr[st.peek()] >= k) {
                int r = i, h = arr[st.pop()], l = st.peek();
                System.out.print(r + " ");
                // System.out.println();
                System.out.print(h + " ");
                // System.out.println();
                System.out.print(l + " ");
                res = Math.max(res, h * (r - l - 1));
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(histogram(arr));
        sc.close();
    }
}