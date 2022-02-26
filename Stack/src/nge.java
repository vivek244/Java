import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class nge {

    static int[] solve(int ar[], int arr[]) {
        int n = ar.length;
        int temp[] = helper(arr);
        int res[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], temp[i]);
        }
        for (int i = 0; i < n; i++) {
            res[i] = map.get(ar[i]);
        }
        return res;
    }

    static int[] helper(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            ans[i] = st.size() > 0 ? st.peek() : -1;
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arrr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arrr[i] = sc.nextInt();
        }
        int res[] = solve(arr, arrr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }

}
