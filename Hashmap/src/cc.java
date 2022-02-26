import java.util.*;

public class cc {

    public static ArrayList<Integer> solve(int arr[]) {
        // Arrays.sort(arr);
        // ArrayList<Integer> numbers = new ArrayList<>();
        // for (int i : arr) {
        // numbers.add(i);
        // }
        // ArrayList<Integer> bigger = new ArrayList<>();
        // for (int x = 0; x < numbers.size(); x++) {
        // int current = numbers.get(x);
        // ArrayList<Integer> temp = new ArrayList<>();
        // temp.add(current);
        // for (int y = x + 1; y < numbers.size(); y++) {
        // int nextValue = numbers.get(y);
        // if (nextValue == current + 1) {
        // temp.add(nextValue);
        // current = nextValue;
        // } else {
        // break;
        // }
        // }

        // if (temp.size() >= bigger.size()) {
        // bigger.clear();
        // bigger.addAll(temp);
        // }
        // }
        // int n = bigger.size();
        // ArrayList<Integer> res = new ArrayList<>();
        // res.add(bigger.get(0));
        // res.add(bigger.get(n - 1));
        // return res;
        int N = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int mx = 0;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for (Integer element : arr) {
            set.add(element);
        }

        for (Integer element : arr) {
            int previousConsecutiveElement = element - 1;

            if (!set.contains(previousConsecutiveElement)) {

                // Element is the first value of consecutive sequence.
                int j = element;

                while (set.contains(j)) {
                    // The next consecutive element by will be j + 1.
                    j++;

                }
                mx = Math.max(mx, j - element);
                res.addAll(set);
            }

        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
        sc.close();
    }

}
