import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class k {

    static void solve(int arr[], int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int x = n / k;
        ArrayList<Integer> ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > x) {
                        ll.add(arr[i]);
                    }
                }
            }
        }
        int nums[] = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            nums[i] = ll.get(i);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // return nums;
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
