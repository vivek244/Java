import java.util.Arrays;
import java.util.Scanner;

public class mai {

    static int solve(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = 0;
        res = (arr[n - 1] - arr[0]) * arr[n - 2];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr));
        }
        sc.close();
    }

}
