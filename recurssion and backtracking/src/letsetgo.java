// import java.util.Scanner;

public class letsetgo {

    static int helper(int arr[], int i) {
        if (i < arr.length) {
            i++;
            return helper(arr, i);
        }
        return i;
    }

    static int solve(int arr[]) {
        return helper(arr, 0);
    }

    static boolean power(int n) {
        if (n == 1)
            return true;
        if (n % 2 != 0)
            return false;
        return power(n / 2);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 15, 14, 20, 63, 78 };
        System.out.println(solve(arr));
        System.out.println(power(86));
    }
}