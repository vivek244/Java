import java.util.Scanner;

public class breaki {

    static void br(char c[], int st, int e) {
        // int n = c.length;
        c[(st + e) / 2] += ' ';
    }

    static String breakWords(String st) {
        int sta = 0, e;
        char[] c = st.toCharArray();
        for (e = 0; e < c.length; e++) {
            if (c[e] == ' ') {
                if (e % 2 == 0) {
                    br(c, sta, e);
                    sta = e + 1;
                } else if (e % 2 != 0) {
                    sta = e + 1;
                }
            }
        }
        String str = new String(c);
        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        System.out.println(breakWords(input));
        s.close();
    }

}
