import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class com {

    static ArrayList<String> solve(String s[]) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String i : s) {
            String a[] = i.split(" ");
            int val = Integer.parseInt(a[0]);
            String w[] = a[1].split("\\.");
            StringBuilder sb = new StringBuilder();
            for (int j = w.length - 1; j >= 0; j--) {
                if (j == w.length - 1) {
                    sb.append(w[j]);
                } else {
                    sb.insert(0, ".");
                    sb.insert(0, w[j]);
                }
                String ss = sb.toString();

                if (map.containsKey(ss) == true) {
                    int c = map.get(ss);
                    map.put(ss, c + val);
                } else {
                    map.put(ss, val);
                }
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for (String l : map.keySet()) {
            StringBuilder sa = new StringBuilder();
            sa.append(map.get(l));
            sa.append(" ");
            sa.append(l);
            res.add(sa.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(solve(arr));
        sc.close();
    }

}
