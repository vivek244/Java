import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class anmapping {

    public static class pair {
        int id = 0;
        ArrayList<Integer> list = new ArrayList<>();
    }

    static int[] solve(int arr[], int ar[]) {
        int res[] = new int[arr.length];
        HashMap<Integer, pair> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                pair p = map.get(ar[i]);
                p.list.add(i);
            } else {
                pair p = new pair();
                p.list.add(i);
                map.put(ar[i], p);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            pair p = map.get(arr[i]);
            res[i] = p.list.get(p.id);
            p.id++;
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
        int ar[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = sc.nextInt();
        }
        // System.out.println(solve(arr, ar));
        int res[] = solve(arr, ar);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }

}
