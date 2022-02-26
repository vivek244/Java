import java.util.Scanner;

public class test {

    static void solve(int arr[]) {
        int forward = 0;
        int backward = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[forward] == 1 || arr[backward] == 0) {
                int temp = arr[forward];
                arr[forward] = arr[backward];
                arr[backward] = temp;
            }
            forward += 1;
            backward -= 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr);
        sc.close();

    }

}
