import java.util.HashMap;
import java.util.Scanner;

public class longdivk {

    static int solve(int arr[], int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, rem = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                int idx = map.get(rem);
                int ans = i - idx;
                if (ans > res) {
                    res = ans;
                }
            } else {
                map.put(rem, i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(solve(arr, k));
        sc.close();
    }

}
