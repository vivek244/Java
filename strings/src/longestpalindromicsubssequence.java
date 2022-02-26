import java.util.Scanner;

public class longestpalindromicsubssequence {

    public static String solve(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = helper(s, i, i), s2 = helper(s, i, i + 1);
            if (s1.length() > res.length()) {
                res = s1;
            }
            if (s2.length() > res.length()) {
                res = s2;
            }
        }
        return res;

    }

    public static String helper(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            i--;
            j++;
        }
        return s.substring(i + 1, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solve(s));
        sc.close();
    }

}
