import java.util.Scanner;

public class str {

    static void help(String s, int n, int index, String ss) {
        if (index == n) {
            return;
        }
        System.out.print(ss + " ");
        for (int i = index + 1; i < n; i++) {
            ss += s.charAt(i);
            help(s, n, i, ss);
            ss = ss.substring(0, ss.length() - 1);
        }
        return;
    }

    static void power(String s) {
        int n = s.length();
        help(s, n, -1, "");
    }

    static int len(String s) {
        if (s.equals("")) {
            return 0;
        }
        return len(s.substring(1)) + 1;
    }

    static int helper(String s, int i, int j, int n) {

        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int ans = helper(s, i + 1, j, n - 1) + helper(s, i, j - 1, n - 1) - helper(s, i + 1, j - 1, n - 2);

        if (s.charAt(i) == s.charAt(j)) {
            ans++;
        }
        return ans;
    }

    static int solve(String s) {
        int n = s.length();
        int ans = helper(s, 0, n - 1, n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
        System.out.println(len(s));
        power(s);
        sc.close();
    }
}