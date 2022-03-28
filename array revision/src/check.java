import java.util.ArrayList;
import java.util.List;

public class check {

    static int count = 0;
    // public static int size;

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("abc");
        list.add(200);
        System.out.print(list.get(0) instanceof Object);
        System.out.print(list.get(1) instanceof Integer);
        int g1 = 1, g2 = 2;
        System.out.println((g2 & g1));
        if (count < 3) {
            count++;
            main(null);
        } else {
            return;
        }
        System.out.print(count);
    }

}
