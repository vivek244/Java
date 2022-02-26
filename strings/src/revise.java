import java.util.Scanner;

public class revise {

    static boolean solve(String s) {
        int i = 0, j = s.length() - 1;
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        } else {
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solve(s));
        sc.close();
    }

}
