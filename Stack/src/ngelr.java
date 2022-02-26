import java.util.Scanner;
import java.util.Stack;

public class ngelr {

    static int[] right(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            res[i] = st.size() > 0 ? st.peek() : -1;
            st.push(arr[i]);
        }
        return res;
    }

    static int[] rightsmall(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() >= arr[i]) {
                st.pop();
            }
            res[i] = st.size() > 0 ? st.peek() : -1;
            st.push(arr[i]);
        }
        return res;
    }

    static int[] left(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            res[i] = st.size() > 0 ? st.peek() : -1;
            st.push(arr[i]);
        }
        return res;
    }

    static int[] leftsmall(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (st.size() > 0 && st.peek() >= arr[i]) {
                st.pop();
            }
            res[i] = st.size() > 0 ? st.peek() : -1;
            st.push(arr[i]);
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
        int res[] = right(arr);
        System.out.println("NGE in right");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int ress[] = left(arr);
        System.out.println("NGE in left");
        for (int i = 0; i < ress.length; i++) {
            System.out.print(ress[i] + " ");
        }
        System.out.println();
        int re[] = rightsmall(arr);
        System.out.println("NSE in right");
        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }

        System.out.println();
        int r[] = leftsmall(arr);
        System.out.println("NSE in left");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        sc.close();
    }

}
