import java.util.HashSet;
import java.util.*;

public class set {

    public static void main(String[] args) {
        HashSet<Character> s = new HashSet<>();
        String str = "vivek kumar";
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
        }
        ArrayList<Character> aa = new ArrayList<Character>(s);
        Collections.sort(aa);
        System.out.println(aa);
        // Iterator hh = aa.iterator();
        // while (hh.hasNext()) {
        // System.out.println(hh.next());
        // }
    }

}
