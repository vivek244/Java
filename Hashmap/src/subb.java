import java.util.HashMap;
import java.util.Scanner;

public class subb {

    public static int solve(String s) {
        int res = 0;
        int i = -1, j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        while (true) {
            boolean w = false;
            boolean v = false;
            while (i < s.length() - 1) {
                w = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) == 2) {
                    break;
                } else {
                    res += i - j;
                }
            }
            while (j < i) {
                v = true;
                j++;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 1) {
                    res += i - j;
                    break;
                }
            }
            if (v == false && w == false) {
                break;
            }
        }

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
