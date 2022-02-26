import java.util.Scanner;

public class number_pattern {

    public static void patter(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 2 * n - (2 * i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                // if (i == n && j == n) {
                // continue;
                // }
                System.out.print(j);
            }
            System.out.println();
        }

        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patter(n);
        sc.close();
    }

}
