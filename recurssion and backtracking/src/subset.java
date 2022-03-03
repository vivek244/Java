import java.util.*;

public class subset {

    static List<Integer> solve(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        helper(arr, 0, 0, res);
        // Collection.sort(res);
        return res;
    }

    static void helper(int[] arr, int a, int sum, List<Integer> res) {
        if (a == arr.length) {
            res.add(sum);
            return;
        }

        helper(arr, a + 1, sum + arr[a], res);
        helper(arr, a + 1, sum, res);
    }

    public static void main(String[] args) {
        int arr[] = { 20, 10, 30, 40 };
        List<Integer> lis = solve(arr);
        for (int j = 0; j < lis.size(); j++) {
            System.out.print(lis.get(j) + " ");
        }
    }
}
