public class negoneside {

    public static void main(String[] args) {
        int[] arr = { -21, 25, -24, 10, -14, -36, 96, -52, 3, -15 };
        int n = arr.length;
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
