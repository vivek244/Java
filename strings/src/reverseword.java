import java.util.Scanner;

public class reverseword {

    static void reverse(char s[], int st, int end) {
        char temp;
        while (st < end) {
            temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
    }

    static String solve(String s) {
        char c[] = s.toCharArray();
        c[c.length + 1] += ' ';
        int st = 0;
        for (int e = 0; e < c.length; e++) {
            if (c[e] == ' ') {
                reverse(c, st, e);
                st = e + 1;
            }
        }
        reverse(c, st, c.length - 1);
        reverse(c, 0, c.length - 1);
        s = new String(c);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(solve(s));
        sc.close();
    }

}
