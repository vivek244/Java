public class sol {

    static void solve(String[] c) {
        int n = c.length;
        int i = 0;
        char cha[] = new char[122];
        char ch = '"';
        while (i < n) {
            cha = c[i].toCharArray();
            for (char k : cha) {
                System.out.print(ch + "" + k + "" + ch + "," + " ");
            }
            i++;
        }
        // for (char k : cha) {
        // System.out.print(ch + "" + k + "" + ch + "," + " ");
        // }
    }

    public static void main(String[] args) {
        String c[] = { "you", "your", "this", "they" };
        solve(c);

    }

}
