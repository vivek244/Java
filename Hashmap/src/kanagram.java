import java.util.HashMap;
import java.util.Scanner;

public class kanagram {

    static boolean solve(String s, String ss, int k) {
        if (ss.length() != s.length()) {
            return false;
        }
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ss.length(); i++) {
            char ch = ss.charAt(i);
            if (map.getOrDefault(ch, 0) > 0) {
                map.put(ch, map.get(ch) - 1);
            }
        }
        for (char ch : map.keySet()) {
            count += map.get(ch);
        }
        if (count > k) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(solve(s1, s2, k));
        sc.close();
    }

}
