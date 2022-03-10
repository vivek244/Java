import java.util.ArrayList;
import java.util.List;

public class ratmaze {

    static void helper(List<String> res, int arr[][], int temp[][], String s, int i, int j) {
        if (i == arr.length - 1 && j == arr.length - 1) {
            res.add(s);
            return;
        }
        if (i + 1 < arr.length && temp[i + 1][j] == 0 && arr[i + 1][j] == 1) {
            temp[i][j] = 1;
            helper(res, arr, temp, s + "D", i + 1, j);
            temp[i][j] = 0;
        }
        if (i - 1 >= 0 && temp[i - 1][j] == 0 && arr[i - 1][j] == 1) {
            temp[i][j] = 1;
            helper(res, arr, temp, s + "U", i - 1, j);
            temp[i][j] = 0;
        }
        if (j + 1 < arr.length && temp[i][j + 1] == 0 && arr[i][j + 1] == 1) {
            temp[i][j] = 1;
            helper(res, arr, temp, s + "R", i, j + 1);
            temp[i][j] = 0;
        }
        if (j - 1 >= 0 && temp[i][j - 1] == 0 && arr[i][j - 1] == 1) {
            temp[i][j] = 1;
            helper(res, arr, temp, s + "L", i, j - 1);
            temp[i][j] = 0;
        }
    }

    static List<String> solve(int arr[][]) {
        int n = arr.length;
        int temp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = 0;
            }
        }
        List<String> res = new ArrayList<>();
        helper(res, arr, temp, "", 0, 0);
        return res;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 0, 0, 1, 0 }, { 1, 1, 1, 1, 1, 0 }, { 1, 0, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 1, 1 }, { 1, 0, 1, 1, 1, 1 } };
        List<String> ans = solve(arr);
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
        System.out.println();
    }

}
