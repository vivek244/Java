import java.util.HashMap;
import java.util.Scanner;

public class exactlyk {

    static String solve(String s, int k) {
        int i = -1, j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        String res = "";
        while (true) {
            boolean f = false;
            boolean e = false;
            while (i < s.length() - 1) {
                f = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                // if (map.size() < k) {
                // continue;
                // }
                if (map.size() <= k) {
                    String ans = s.substring(j + 1, i + 1);
                    if (ans.length() > res.length()) {
                        res = ans;
                    }
                } else {
                    break;
                }
            }
            while (j < i) {
                e = true;
                j++;
                char ch = s.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
                if (map.size() > k) {
                    continue;
                }
                if (map.size() <= k) {
                    String ans = s.substring(j + 1, i + 1);
                    if (ans.length() > res.length()) {
                        res = ans;
                    }
                    break;
                }
            }
            if (e == false && f == false) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        // String s2 = sc.next();
        int k = sc.nextInt();
        System.out.println(solve(s1, k));
        sc.close();
    }

}
