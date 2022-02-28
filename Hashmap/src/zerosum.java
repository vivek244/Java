
// import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Scanner;

public class zerosum {

    public static int solve(int[] arr) {
        int max = 0, i = -1, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, i);
        while (i < arr.length - 1) {
            i++;
            sum += arr[i];
            if (map.containsKey(sum) == false) {
                map.put(sum, i);
            } else {
                int len = i - map.get(sum);
                if (len > max) {
                    max = len;
                }
            }
        }
        return max;

    }

    static int total(int arr[]) {
        int count = 0, i = -1, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        while (i < arr.length - 1) {
            i++;
            sum += arr[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
        System.out.println(total(arr));
        // solve(arr);
        sc.close();
    }
}
