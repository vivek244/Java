public class cn1 {

    static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    static int count(int a) {
        if (a == 0)
            return 0;
        int ans = count(a / 10);
        return ans + 1;
    }

    static int help(int arr[], int n) {
        if (n == arr.length)
            return 0;
        return arr[n] + help(arr, n + 1);
    }

    static int sum(int arr[]) {
        return help(arr, 0);
    }

    static boolean helper(int arr[], int x, int n) {
        if (n == arr.length)
            return false;
        if (arr[n] == x)
            return true;
        return helper(arr, x, n + 1);
    }

    static boolean find(int arr[], int x) {
        return helper(arr, x, 0);
    }

    static int h(int arr[], int x, int n) {
        if (n <= 0)
            return -1;
        if (arr[n] == x)
            return n;
        return h(arr, x, n - 1);
    }

    static int pos(int arr[], int x) {
        return h(arr, x, arr.length - 1);
    }

    static int hh(int n, int i) {
        if (i >= n)
            return 0;
        i++;
        return i + hh(n, i);
    }

    static int ss(int n) {
        return hh(n, 0);
    }

    static int s(int n) {
        if (n == 0)
            return 0;
        return n + s(n - 1);
    }

    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println(power(a, b));
        int c = 2546844;
        System.out.println(count(c));
        int arr[] = { 10, 20, 30, 40, 20, 30 };
        int d = 20;
        System.out.println(ss(d));
        System.out.println(s(d));
        System.out.println(sum(arr));
        System.out.println(find(arr, d));
        System.out.println(pos(arr, d));
    }
}
