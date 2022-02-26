import java.util.Scanner;

public class methods {

    static void solve(String s, String ss) {
        System.out.println(s.indexOf("vivek"));
        System.out.println(ss.charAt(4));
        System.out.println(ss.indexOf("ger"));
        System.out.println(s.charAt(12));
        System.out.println(s.compareTo(ss));
        System.out.println(s.contains("viv"));
        System.out.println(ss.endsWith("r"));
        System.out.println(s.replace("kumar", "tiger"));
        System.out.println(s.toUpperCase());
        System.out.println(ss.toLowerCase());
        // System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.next();
        solve(s, ss);
        sc.close();
    }
}