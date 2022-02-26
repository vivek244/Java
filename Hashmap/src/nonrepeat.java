import java.util.HashMap;
import java.util.Scanner;

public class nonrepeat {

    static String solve(String s) {
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1, j = -1;

        while (true) {
            boolean f = false;
            boolean e = false;
            while (i < s.length() - 1) {
                f = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.get(ch) == 2) {
                    break;
                } else {
                    String ans = s.substring(j + 1, i + 1);
                    if (ans.length() > res.length()) {
                        res = ans;
                    }
                }
            }
            while (j < i) {
                e = true;
                j++;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 1) {
                    break;
                }
            }
            if (f == false && e == false) {
                break;
            }
        }
        System.out.println(res.length());
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        // String s2 = sc.next();
        System.out.println(solve(s1));
        sc.close();
    }

}
