
// import java.util.Arrays;
import java.util.Scanner;

public class kk {

    // static void helper(String s, int count[]) {
    // for (int i = 0; i < s.length(); i++) {
    // count[s.charAt(i)]++;
    // }
    // }

    static int[] getCharCountArray(String str) {
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            System.out.println(count[i]);
        }
        return count;
    }

    static String res(String str,
            String mask_str) {
        int count[] = getCharCountArray(mask_str);
        int ip_ind = 0, res_ind = 0;

        char arr[] = str.toCharArray();

        while (ip_ind != arr.length) {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }

        str = new String(arr);

        return str.substring(0, res_ind);
    }

    // static String solve(String s) {
    // String str = new String();
    // int count[] = new int[256];
    // helper(s, count);
    // for (int i = 0; i < 256; i++) {
    // if (count[i] > 1) {
    // str += (char) (i);
    // }
    // }

    // return str;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String j = sc.next();
        // System.out.print(solve(s));
        System.out.print(res(s, j));
        sc.close();
    }

}
