import java.util.Scanner;

public class qs {

    public static void solve(int n) {
        int num = 1;
        for (int i = 0; i <= n; i++) {
            num = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }

        int a = 9, b = 8;
        System.out.println(Math.min(a, b));

        for (int i = 0; i <= n / 2 + 1; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n / 2 + 1; i >= 0; i--) {
            for (int j = i; j > 2; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        sc.close();
    }

}
