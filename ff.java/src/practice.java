import java.util.Scanner;

public class practice {

    static void solution(int n) {

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j < n; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // int k = 1;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         if (i == 0 || j == 0) {
        //             k = 1;
        //         } else {
        //             k = k * (i - j + 1) / j;
        //         }
        //         System.out.print(k + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j < n; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || i == n || j == 1 || j == n) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int len = 2 * n - 1;
        // for (int i = 0; i < len; i++) {
        // for (int j = 0; j < 2 * n - 1; j++) {
        // int min = i < j ? i : j;
        // min = min < len - i ? min : len - i - 1;
        // min = min < len - j ? min : len - j - 1;
        // System.out.print(n - min + " ");
        // }

        // System.out.println();
        // }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        sc.close();
    }

}
