import java.util.Arrays;
import java.util.Scanner;

public class duplicate {

    static String solve(String s) {
        int n = s.length();
        int index = 0;
        char c[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    break;
                }
            }
            if (j == i) {
                c[index++] = c[i];
            }
        }
        return String.valueOf(Arrays.copyOf(c, index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str = new String();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (str.indexOf(c) > 0) {
                str += c;
            }
        }
        System.out.print(str);

        char t[] = s.toCharArray();
        Arrays.sort(t);
        str = new String(t);
        // System.out.println(str);
        System.out.print(solve(s));

        sc.close();
    }

}
