public class allindices {

    static int[] help(int arr[], int x, int n) {
        if (n == arr.length) {
            int ans[] = new int[0];
            return ans;
        }
        int ss[] = help(arr, x, n + 1);
        if (arr[n] == x) {
            int res[] = new int[ss.length + 1];
            res[0] = n;
            for (int i = 0; i < ss.length; i++) {
                res[i + 1] = ss[i];
            }
            return res;
        } else {
            return ss;
        }
    }

    static int[] solve(int arr[], int x) {
        return help(arr, x, 0);
    }

    static boolean pal(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return pal(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

    static int[] ans(int arr[], int a, int n) {
        // int n=arr.length;
        if (a > n) {
            return arr;
        }
        int temp = arr[a];
        arr[a] = arr[n - 1];
        arr[n - 1] = temp;

        return ans(arr, a + 1, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 3, 21, 10, 45, 10, 65, 85, 10, 41, 14, 12 };
        int a = 10;
        int out[] = solve(arr, a);
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
        String s = "nitin";
        System.out.println(pal(s));
        int oo[] = ans(arr, 0, arr.length);
        for (int i = 0; i < oo.length; i++) {
            System.out.print(oo[i] + " ");
        }
    }
}
