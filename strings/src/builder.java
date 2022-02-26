import java.util.Scanner;

public class builder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Lets do this");
        System.out.println(sb);
        sb.append("Now start");
        System.out.println(sb);
        System.out.println(sb.appendCodePoint(5));
        System.out.println(sb.codePointAt(9));
        System.out.println(sb.codePointCount(2, 6));
        System.out.println(sb.substring(2));
        System.out.println(sb.delete(2, 6));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2, 5, "vivek"));
        sc.close();
    }

}
