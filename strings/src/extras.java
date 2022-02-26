public class extras {

    public static void main(String[] args) {
        // String s = "123";
        // int num = Integer.parseInt(s);
        // int nu=Interger.valueOf(s);
        // System.err.println(num);
        String s = "naman";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    }

}
