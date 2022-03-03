import java.util.ArrayList;
import java.util.List;

public class nqueens {

    static List<String> cons(char ch[][]) {
        List<String> p = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            p.add(new String(ch[i]));
        }
        return p;
    }

    static boolean valid(char chess[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            if (chess[i][c] == 'Q') {
                return false;
            }
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void helper(char chess[][], List<List<String>> res, int r) {
        if (r == chess.length) {
            res.add(cons(chess));
            return;
        }
        for (int c = 0; c < chess.length; c++) {
            if (valid(chess, r, c)) {
                chess[r][c] = 'Q';
                helper(chess, res, r + 1);
                chess[r][c] = '.';
            }
        }
    }

    public static List<List<String>> solve(int n) {
        List<List<String>> res = new ArrayList<>();
        char ch[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ch[i][j] = '.';
            }
        }
        helper(ch, res, 0);
        return res;
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<String>> lis = solve(n);
        // for (int i = 0; i < lis.size(); i++) {
        // for (int j = 0; j< lis.size(); j++) {
        // System.out.print(lis.get(i).get(j) + " ");
        // }
        // System.out.println();
        // }
        lis.forEach(System.out::println);
    }

}
