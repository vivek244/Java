import java.util.*;

public class test {

    public static String[] allStrings(String charSet, int len) {

        String prefix = "";
        ArrayList<String> res = new ArrayList<String>();
        printAllKLengthRec(charSet, prefix, len, res);
        String ans[] = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    static void printAllKLengthRec(String set, String prefix, int k,
            ArrayList<String> res) {

        if (k == 0) {
            res.add(prefix);
            return;
        }
        for (int i = 0; i < set.length(); ++i) {
            String newPrefix = prefix + set.charAt(i);
            printAllKLengthRec(set, newPrefix, k - 1, res);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String charSet = s.next();
        int len = s.nextInt();
        String ans[] = test.allStrings(charSet, len);
        for (String str : ans) {
            System.out.println(str);
        }
        s.close();
    }

}
