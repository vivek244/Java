import java.util.Scanner;

public class leet1 {

    public static String solve(String words[]) {
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            sb.reverse();
            if (words[i].equals(sb.toString())) {
                return words[i];
            }
        }
        return "";

        // for (String word : words) {
        // if (word.equals("" + new StringBuilder(word).reverse())) {
        // return word;
        // }
        // }
        // return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(solve(arr));
        // solve(arr);
        sc.close();
    }

}
