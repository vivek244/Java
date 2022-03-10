import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class check {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2);
        List<Integer> b = Arrays.asList(3, 4);
        List<Integer> c = Arrays.asList(6, 5, 7);
        List<Integer> d = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> to = new ArrayList<>();
        to.add(a);
        to.add(b);
        to.add(c);
        to.add(d);
        int m = to.size();
        int n = to.get(m - 1).size();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = to.get(m - 1).get(i);
            // System.out.print(M[i] + " ");
        }
        // System.out.println(to.get(2));
        for (int i = n - 2; i >= 0; i--) {
            List<Integer> cur = to.get(i);
            for (int j = 0; j < cur.size(); j++) {
                M[j] = Math.min(M[j], M[j + 1]) + cur.get(j);
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(M[i] + " ");
        }
    }
}