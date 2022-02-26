import java.util.Scanner;

public class leet2 {

    public static String solve(String s, int spaces[]) {
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); sb.append(s.charAt(i++))) {
            if (j < spaces.length && i == spaces[j]) {
                sb.append(' ');
                j++;
            }
        }
        return "" + sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(s, arr));
        sc.close();
    }

}
