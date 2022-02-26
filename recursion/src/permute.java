import java.util.Scanner;

public class permute {

    static int fib(int n) {
        if (n <= 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static boolean helper(String s, int i, int j) {
        if (i == j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        if (i < j + 1) {
            return helper(s, i + 1, j - 1);
        }
        return true;
    }

    static boolean solve(String s) {
        int n = s.length();
        boolean ans = helper(s, 0, n - 1);
        return ans;
    }

    static void power(String s) {
        String ans = "";
        int n = s.length();
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            String l = s.substring(0, i);
            String r = s.substring(i + 1);
            String ss = l + r;
            power(ss);
            System.out.print(ans + " ");
            ans += ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(solve(s));
        System.out.println(fib(n));
        // power(s);
        sc.close();
    }

}
