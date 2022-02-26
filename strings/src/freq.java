import java.util.Scanner;

public class freq {

    public static String pal(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        return nstr;
    }

    // public void
    public static void solve(String s, int n, int arr[][]) {
        String ss = "";
        for (int i = 0; i < n; i++) {
            ss = s.substring(arr[i][0], arr[i][1] + 1);
            String k = pal(ss);
            System.out.println(k);
            // System.out.println(ss);
            // if (ss == k) {
            // System.out.println("Yes");
            // } else {
            // System.out.println("No");
            // }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solve(s, n, arr);
        sc.close();
    }

}
