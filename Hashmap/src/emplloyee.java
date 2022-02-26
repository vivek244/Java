import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class emplloyee {

    public static void solve(HashMap<String, String> map) {
        HashMap<String, HashSet<String>> tree = new HashMap<>();
        String ceo = "";
        for (String emp : map.keySet()) {
            String man = map.get(emp);

            if (man.equals(emp)) {
                ceo = man;
            } else {
                if (tree.containsKey(man)) {
                    HashSet<String> emps = tree.get(man);
                    emps.add(emp);
                } else {
                    HashSet<String> emps = new HashSet<>();
                    emps.add(emp);
                    tree.put(man, emps);
                }
            }
        }
        HashMap<String, Integer> res = new HashMap<>();
        get(tree, ceo, res);
        System.out.println("The Answer is:");
        for (String emp : res.keySet()) {
            System.out.println(emp + " " + res.get(emp));
        }
    }

    public static int get(HashMap<String, HashSet<String>> tree, String cc, HashMap<String, Integer> res) {
        if (tree.containsKey(cc) == false) {
            res.put(cc, 0);
            return 1;
        }
        int s = 0;
        for (String emp : tree.get(cc)) {
            int c = get(tree, emp, res);
            s += c;
        }
        res.put(cc, s);
        return s + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.next());
        }
        solve(map);
        sc.close();
    }

}
