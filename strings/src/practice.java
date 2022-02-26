import java.util.Scanner;

public class practice {

    static final int a[] = new int[256];

    static void helper(String s) {
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
            // System.out.print(a[s.charAt(i)]);
        }

    }

    static String solve(String s) {
        helper(s);
        int index = -1;
        char c[] = new char[256];
        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] == 1) {
                index = i;
                c[i] += s.charAt(index);
            }
        }
        String str = new String(c);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
        sc.close();
    }
}
