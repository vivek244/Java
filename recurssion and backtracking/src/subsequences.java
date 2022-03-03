import java.util.ArrayList;
import java.util.List;

public class subsequences {

    static void helper(List<List<Integer>> list, List<Integer> temp, int arr[],
            int s) {
        list.add(new ArrayList<>(temp));
        for (int i = s; i < arr.length; i++) {
            temp.add(arr[i]);
            helper(list, temp, arr, i + 1);
            temp.remove(temp.size() - 1);
        }

    }

    static List<List<Integer>> solve(int arr[]) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), arr, 0);
        return list;
    }

    static int sub(int arr[], int sum, int temp, int s) {
        int n = arr.length;
        if (temp == n) {
            if (s == sum) {
                return 1;
            } else {
                return 0;
            }
        }
        s += arr[temp];
        int l = sub(arr, sum, temp + 1, s);
        s -= arr[temp];
        int r = sub(arr, sum, temp + 1, s);
        System.out.print(l + " ");
        System.out.print(r + " ");
        System.out.println();
        return l + r;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        List<List<Integer>> lis = solve(arr);
        for (int i = 0; i < lis.size(); i++) {
            for (int j = 0; j < lis.get(i).size(); j++) {
                System.out.print(lis.get(i).get(j) + " ");
            }
            System.out.println();
        }
        int nums[] = { 10, 20, 30, 40 };
        int sum = 60;
        System.out.println(sub(nums, sum, 0, 0));
    }

}
