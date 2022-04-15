public class check {

    public static void main(String[] args) {
        int temp[] = new int[100];
        int arr[] = { 1, 2, 2, 2, 2, 3, 3, 4, 5 };
        for (int n : arr) {
            temp[n] += n;
        }
        int dp[] = new int[100];
        dp[0] = temp[0];
        dp[1] = temp[1];
        for (int i = 2; i < temp.length; i++) {
            dp[i] = Math.max(temp[i] + dp[i - 2], dp[i - 1]);
        }
        System.out.println(dp[99]);

        for (int i = 0; i < 100; i++) {
            System.out.print(dp[i] + " ");
        }
        // System.out.println();
        // System.out.println(temp[arr[5]]);
        // System.out.println(arr[5]);
    }

}
