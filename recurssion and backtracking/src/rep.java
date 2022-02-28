public class rep {

    static String solve(String s, char r, char x) {
        if (s.length() < 1)
            return s;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == r) {
                s = s.substring(0, i) + x + s.substring(++i);
                return solve(s, r, x);
            }
        }
        return s;
    }

    static String dup(String s) {
        if (s.length() <= 1)
            return s;
        if (s.charAt(0) == s.charAt(1)) {
            return dup(s.substring(1));
        } else {
            return s.charAt(0) + dup(s.substring(1));
        }
    }

    static int fib(int n) {
        if (n <= 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        String s = "vivel";
        char r = 'l';
        char x = 'k';
        System.out.println(solve(s, r, x));
        String str = "aaddavvrfeeassaas";
        System.out.println(dup(str));
        int n = 10;
        System.out.println(fib(n));
    }

}
