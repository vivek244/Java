import java.util.HashMap;
import java.util.Scanner;

public class minwindow {

    static String solve(String s, String str) {
        String res = "";
        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1, j = -1, mat = 0;
        int n = str.length();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;
            while (i < s.length() - 1 && mat < n) {
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.getOrDefault(ch, 0) <= m.getOrDefault(ch, 0)) {
                    mat++;
                }
                f1 = true;
            }
            while (j < i && mat == n) {
                String aa = s.substring(j + 1, i + 1);
                if (res.length() == 0 || aa.length() < res.length()) {
                    res = aa;
                }
                j++;
                char ch = s.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
                if (map.getOrDefault(ch, 0) < m.getOrDefault(ch, 0)) {
                    mat--;
                }
                f2 = true;
            }
            if (f1 == false && f2 == false) {
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solve(s1, s2));
        sc.close();
    }

}
