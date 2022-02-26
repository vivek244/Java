
import java.util.Scanner;
import java.util.*;

public class consecutive {

    public static ArrayList<Integer> solve(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i : arr) {
            if (map.containsKey(i) && map.get(i) != 0) {
                a.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        Collections.sort(a);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
        sc.close();
    }

}
