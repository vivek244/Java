import java.util.Scanner;

public class reverse {

    static String solve(String s) {
        int n = s.length();
        char c[] = s.toCharArray();
        char temp;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            temp = c[j];
            c[j] = c[i];
            c[i] = temp;
        }
        s = new String(c);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solve(s));
        sc.close();
    }

}
