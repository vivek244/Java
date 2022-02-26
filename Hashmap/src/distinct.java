import java.util.ArrayList;
import java.util.Scanner;

public class distinct {

    public static ArrayList<Integer> solve(int arr[], int k) {
        ArrayList<Integer> res = new ArrayList<>();
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        ArrayList<Integer> ar = solve(arr, x);
        for (int i : ar) {
            System.out.println(i + " ");
        }
        sc.close();
    }
}
