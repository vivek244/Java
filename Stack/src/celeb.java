import java.util.Scanner;
import java.util.Stack;

public class celeb {

    public static int solve(int arr[][]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();
            if (arr[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }
        int res = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != res) {
                if (arr[i][res] == 0 || arr[res][i] == 1) {
                    return 0;
                }
            }
        }
        return res + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(arr));
        sc.close();
    }

}
