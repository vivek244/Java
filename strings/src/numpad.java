import java.util.Scanner;

public class numpad {

    public static String solve(String arr[], String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res = res + "0" + " ";
            } else {
                int po = s.charAt(i) - 'a';
                res = res + arr[po] + " ";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = { "2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"
        };
        String s = sc.next();
        System.out.println(solve(str, s));
        sc.close();
    }

}
