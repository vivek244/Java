public class sort012 {

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 0, 1, 2, 0, 0, 1, 2, 0, 0, 1, 2 };
        int n = arr.length;
        int res[] = new int[n];
        res = arr;
        // int j, a = 0, b = 0, c = 0;
        // for (j = 0; j < n; j++) {
        // switch (arr[j]) {
        // case 0:
        // a++;
        // break;
        // case 1:
        // b++;
        // break;
        // case 2:
        // c++;
        // break;
        // }
        // }

        // j = 0;
        // while (a > 0) {
        // res[j++] = 0;
        // a--;
        // }
        // while (b > 0) {
        // res[j++] = 1;
        // b--;
        // }
        // while (c > 0) {
        // res[j++] = 2;
        // c--;
        // }

        // Alternate approach 1 pass method
        int a = 0, b = n - 1, in = 0;
        while (in <= b) {
            if (res[in] == 0) {
                res[in] = res[a];
                res[a] = 0;
                a++;
            }
            if (res[in] == 2) {
                res[in] = res[b];
                res[b] = 2;
                in--;
                b--;
            }
            in++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }

    }

}
