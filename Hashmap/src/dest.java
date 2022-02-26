import java.util.HashMap;
import java.util.Scanner;

public class dest {

    public static void solve(int arr[], int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int rem = i % x;
            int of = map.getOrDefault(rem, 0);
            map.put(rem, of + 1);
        }
        for (int val : arr) {
            int rem = val % x;
            if (rem == 0) {
                int fq = map.get(rem);
                if (fq % 2 == 1) {
                    System.out.println("false");
                    return;
                }
            } else if (2 * rem == x) {
                int fq = map.get(rem);
                if (fq % 2 == 1) {
                    System.out.println("false");
                    return;
                }
            } else {
                int fq = map.get(rem);
                int f = map.getOrDefault(x - rem, 0);
                while (fq != f) {
                    System.out.println("false");
                    return;
                }
            }

        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        solve(arr, x);
        sc.close();
    }
}
