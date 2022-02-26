import java.util.Scanner;

public class gcd {

    static int till(int a) {
        if (a <= 1) {
            return a;
        }
        System.out.print(a + " ");
        return till(a - 1);
    }

    static int dec(int x) {
        if (x == 0) {
            return 0;
        }
        return x % 2 + 10 * dec(x / 2);
    }

    static int solve(int a, int b) {

        if (a == b) {
            return a;
        }

        if (a > b) {
            return solve(a - b, b);
        }
        return solve(a, b - a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solve(a, b));
        System.out.println(dec(a));
        System.out.print(till(a));
        sc.close();
    }

}
